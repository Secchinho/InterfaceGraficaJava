package trabalhoprog2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import trabalhoprog2.model.Produto;
import trabalhoprog2.view.Tela;

public class ProdutoController {
    // Declaração da lista para armazenar produtos
    private List<Produto> produtos = new ArrayList<>();
    
    // Método para adicionar os produtos à lista
    public void adicionarProdutos(String nome, double preco, int qtd){
        produtos.add(new Produto(nome, preco, qtd));
    }
    
    // Método para limpar os campos de entrada na interface gráfica
    public void limpar(Tela tela){
        tela.getTxtNome().setText("");
        tela.getTxtPreco().setText("");
        tela.getTxtQntd().setText("");
    }
    
    // Construtor da classe responsável por definir as ações dos botões
    public ProdutoController(Tela tela){

        // Adiciona um evento ao botão de cadastro
        tela.getBotaoCadastrar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                tela.getAreaTextual().setText("");
                String nome = tela.getTxtNome().getText();
                  
                try
                {
                    // Validação para evitar as entradas inválidas
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
                        //Conversão dos valores para números
                        double preco = Double.parseDouble(tela.getTxtPreco().getText());
                        int qntd = Integer.parseInt(tela.getTxtQntd().getText());
                        
                        // Agora, verificando se os valores numéricos são válidos
                        if (preco < 0) {
                            throw new IllegalArgumentException("O preço não pode ser negativo.");
                        }
                
                        if (qntd < 0) {
                            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
                        }

                        // Adiciona o produto à lista e limpa os campos
                        adicionarProdutos(nome, preco, qntd);
                        limpar(tela);
                    }
                }
//oi
                // Captura o erro caso tente inserir algo que não seja um número em Preço e Quantidade
                catch(NumberFormatException e)
                {
                    tela.getAreaTextual().setText("");
                    tela.getAreaTextual().setText("Erro: Preço e Quantidade devem ser valores numéricos!"); 
                }
                // Captura outros erros de validação e exibe a mensagem correspondente
                catch(IllegalArgumentException e)
                {
                    tela.getAreaTextual().setText("");
                    tela.getAreaTextual().setText("Erro: " + e.getMessage());  
                }
            }
        });
        
        // Adiciona um evento ao botão de listar produtos
        tela.getBotaoListar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                tela.getAreaTextual().setText("");
                for(Produto produtos: produtos){
                    tela.getAreaTextual().append(produtos.toString());
                }
            }
        });
        
        // Adiciona um evento ao botão de limpar tela
        tela.getBotaoLimpar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                limpar(tela);
                tela.getAreaTextual().setText("");
            }
        });
    }
}
