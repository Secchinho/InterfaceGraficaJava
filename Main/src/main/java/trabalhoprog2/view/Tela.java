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
        setLayout(null);

        lbNome = new JLabel("Nome:");
        lbNome.setFont(new Font("Arial", Font.PLAIN, 17));
        lbNome.setBounds(20, 0, 50, 20);
        add(lbNome);
        txtNome = new JTextField();

        lbPreco = new JLabel("Preco:");
        txtPreco = new JTextField();

        lbQntd = new JLabel("Quantidade:");
        txtQntd = new JTextField();

        setVisible(true);
    }
}
