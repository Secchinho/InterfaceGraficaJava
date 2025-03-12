package trabalhoprog2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import trabalhoprog2.view.*;

import trabalhoprog2.model.Produto;

public class ProdutoController {
    private final List<Produto> produtos = new ArrayList<>();
    
    public void adicionarProdutos(String nome, double preco, int qtd){
            produtos.add(new Produto(nome, preco, qtd));
        }
    
    public void limpar(Tela tela){
        tela.getTxtNome().setText("");
        tela.getTxtPreco().setText("");
        tela.getTxtQntd().setText("");
    }
    
    public ProdutoController(Tela tela){
        tela.getBotaoCadastrar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                tela.getAreaTextual().setText("");
                String nome = tela.getTxtNome().getText();
                
            
                
                try
                {
                    
                    if(tela.getTxtNome().getText().trim().isEmpty()){
                        throw new IllegalArgumentException("O campo nome não pode estar vazio.");
                    }
                    else if(tela.getTxtPreco().getText().trim().isEmpty()){
                        throw new IllegalArgumentException("O campo preco não pode estar vazio.");
                    }
                    else if(tela.getTxtQntd().getText().trim().isEmpty()){
                        throw new IllegalArgumentException("O campo quantidade não pode estar vazio.");
                    }
                    else{
                        double preco = Double.parseDouble(tela.getTxtPreco().getText());
                        int qntd = Integer.parseInt(tela.getTxtQntd().getText());
                        
                        if (preco < 0) {
                        throw new IllegalArgumentException("O preço não pode ser negativo.");
                    }
                
                    if (qntd < 0) {
                        throw new IllegalArgumentException("A quantidade não pode ser negativa.");
                    }
                    adicionarProdutos(nome, preco, qntd);
                    limpar(tela);
                    }
                
                }
//oi
                catch(IllegalArgumentException e)
                {
                    tela.getAreaTextual().setText("");
                    tela.getAreaTextual().setText("Erro: " + e.getMessage());  
                }
            }
            
        });
        
        tela.getBotaoListar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                for(Produto produtos: produtos){
                    tela.getAreaTextual().append(produtos.toString());
                }
            }
            });
        
        tela.getBotaoLimpar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                limpar(tela);
                tela.getAreaTextual().setText("");
            }
        });
        
    }
    
}
