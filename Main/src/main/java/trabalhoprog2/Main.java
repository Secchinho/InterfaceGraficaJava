package trabalhoprog2;

import trabalhoprog2.controller.ProdutoController;
import trabalhoprog2.view.Tela;

public class Main {

    public static void main(String[] args) {
        // Criando a interface gráfica
        Tela tela = new Tela();

        // Inicializando o controlador que gerencia a interação da tela com produtos.
        ProdutoController p = new ProdutoController(tela);
    }
}