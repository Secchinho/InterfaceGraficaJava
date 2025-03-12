package trabalhoprog2;

import trabalhoprog2.controller.ProdutoController;
import trabalhoprog2.view.*;

public class Main {

    public static void main(String[] args) {
        Tela tela = new Tela();
        ProdutoController p = new ProdutoController(tela);
    }
}