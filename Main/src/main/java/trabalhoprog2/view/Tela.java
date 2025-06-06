package trabalhoprog2.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Classe Tela que representa a interface gráfica
public class Tela extends JFrame{
    // Declaração dos componentes da interface
    private JButton botaoCadastrar, botaoListar, botaoLimpar;
    private JTextField txtNome, txtPreco, txtQntd;
    private JTextArea areaTextual;
    private JLabel lbNome, lbPreco, lbQntd;


    //Getters e Setters dos atributos 
    public JButton getBotaoCadastrar(){
        return botaoCadastrar;
    }
    
    public JButton getBotaoListar(){
        return botaoListar;
    }
    
    public JButton getBotaoLimpar(){
        return botaoLimpar;
    }
    
    public void setTxtNome(JTextField txtNome){
        this.txtNome = txtNome;
    }
    
    public JTextField getTxtNome(){
        return txtNome;
    }
    
    public void setTxtPreco(JTextField txtPreco){
        this.txtPreco = txtPreco;
    }
    
    public JTextField getTxtPreco(){
        return txtPreco;
    }
    
    public void setTxtQntd(JTextField txtQntd){
        this.txtQntd = txtQntd;
    }
    
    public JTextField getTxtQntd(){
        return txtQntd;
    }
    
    public void setAreaTextual(JTextArea areaTextual){
        this.areaTextual = areaTextual;
    }
    
    public JTextArea getAreaTextual(){
        return areaTextual;
    }

    // Construtor da classe Tela
    public Tela(){
         // Configuração da janela
         setTitle("Cadastro de Produtos"); // Define o título da janela
         setSize(500, 500); // Define o tamanho da janela
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a ação ao fechar a janela
         setLocationRelativeTo(null); // Centraliza a janela na tela
         setLayout(null); // Define o layout como nulo (absoluto)
         getContentPane().setBackground(new Color(30, 30, 47)); // Define a cor de fundo da janela
 
         // Definição da fonte padrão
         Font font = new Font("Arial", Font.PLAIN, 17);
 
         // Criação e configuração do "Nome"
         lbNome = new JLabel("Nome:");
         lbNome.setFont(font);
         lbNome.setForeground(Color.WHITE);
         lbNome.setBounds(20, 0, 60, 20);
         add(lbNome);
 
         // Campo de entrada para o nome do produto
         txtNome = new JTextField();
         txtNome.setBounds(20, 20, 440, 30);
         add(txtNome);
 
         // Criação e configuração do "Preço"
         lbPreco = new JLabel("Preço:");
         lbPreco.setFont(font);
         lbPreco.setForeground(Color.WHITE);
         lbPreco.setBounds(20, 60, 55, 20);
         add(lbPreco);
 
         // Campo de entrada para o preço do produto
         txtPreco = new JTextField();
         txtPreco.setBounds(20, 80, 440, 30);
         add(txtPreco);
 
         // Criação e configuração da "Quantidade"
         lbQntd = new JLabel("Quantidade:");
         lbQntd.setFont(font);
         lbQntd.setForeground(Color.WHITE);
         lbQntd.setBounds(20, 120, 105, 20);
         add(lbQntd);
 
         // Campo de entrada para a quantidade do produto
         txtQntd = new JTextField();
         txtQntd.setBounds(20, 140, 440, 30);
         add(txtQntd);
 
         // Criação dos botões e configuração de cores
         botaoCadastrar = new JButton("Cadastrar");
         botaoCadastrar.setBackground(new Color(40, 167, 69)); // Verde
         botaoCadastrar.setForeground(Color.WHITE);
 
         botaoLimpar = new JButton("Limpar");
         botaoLimpar.setBackground(new Color(220, 53, 69)); // Vermelho
         botaoLimpar.setForeground(Color.WHITE);
 
         botaoListar = new JButton("Listar");
         botaoListar.setBackground(new Color(255, 193, 7)); // Amarelo
         botaoListar.setForeground(Color.WHITE);
 
         // Definição da posição dos botões na tela
         botaoCadastrar.setBounds(20, 180, 105, 30);
         botaoLimpar.setBounds(125, 180, 100, 30);
         botaoListar.setBounds(225, 180, 100, 30);
 
         // Adiciona os botões na tela
         add(botaoCadastrar);
         add(botaoLimpar);
         add(botaoListar);
 
         // Criação da área de texto para exibição de informações
         areaTextual = new JTextArea();
         areaTextual.setBounds(20, 220, 440, 225);
         areaTextual.setBackground(Color.DARK_GRAY);
         areaTextual.setForeground(Color.WHITE);
         areaTextual.setFont(new Font("Arial", Font.PLAIN, 14));
         add(areaTextual);
         
         // Torna a janela visível
         setVisible(true);
    }
}
