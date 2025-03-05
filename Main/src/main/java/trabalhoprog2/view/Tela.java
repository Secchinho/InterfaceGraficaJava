package trabalhoprog2.view;

import javax.swing.*;
import java.awt.*;

import trabalhoprog2.controller.ProdutoController;

public class Tela extends JFrame{
    private JButton botaoCadastrar, botaoListar, botaoLimpar;
    private JTextField txtNome, txtPreco, txtQntd;
    private JTextArea areaTextual;
    private JLabel lbNome, lbPreco, lbQntd;

    public Tela(){
        setTitle("Cadastro de Produtos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(30, 30, 47));

        Font font = new Font("Arial", Font.PLAIN, 17);

        lbNome = new JLabel("Nome:");
        lbNome.setFont(font);
        lbNome.setForeground(Color.WHITE);
        lbNome.setBounds(20, 0, 50, 20);
        add(lbNome);

        txtNome = new JTextField();
        txtNome.setBounds(20, 20, 440, 30);
        add(txtNome);

        lbPreco = new JLabel("Preço:");
        lbPreco.setFont(font);
        lbPreco.setForeground(Color.WHITE);
        lbPreco.setBounds(20, 60, 50, 20);
        add(lbPreco);

        txtPreco = new JTextField();
        txtPreco.setBounds(20, 80, 440, 30);
        add(txtPreco);

        lbQntd = new JLabel("Quantidade:");
        lbQntd.setFont(font);
        lbQntd.setForeground(Color.WHITE);
        lbQntd.setBounds(20, 120, 100, 20);
        add(lbQntd);

        txtQntd = new JTextField();
        txtQntd.setBounds(20, 140, 440, 30);
        add(txtQntd);

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBackground(new Color(40, 167, 69));
        botaoCadastrar.setForeground(Color.WHITE);

        botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBackground(new Color(220, 53, 69));
        botaoLimpar.setForeground(Color.WHITE);

        botaoListar = new JButton("Listar");
        botaoListar.setBackground(new Color(255, 193, 7));
        botaoListar.setForeground(Color.WHITE);

        botaoCadastrar.setBounds(20, 180, 100, 30);
        botaoLimpar.setBounds(120, 180, 100, 30);
        botaoListar.setBounds(220, 180, 100, 30);

        add(botaoCadastrar);
        add(botaoLimpar);
        add(botaoListar);

        areaTextual = new JTextArea();
        areaTextual.setBounds(20, 220, 440, 225);
        areaTextual.setBackground(Color.DARK_GRAY);
        areaTextual.setForeground(Color.WHITE);
        areaTextual.setFont(new Font("Arial", Font.PLAIN, 14));
        add(areaTextual);
        
        setVisible(true);
    }
}
