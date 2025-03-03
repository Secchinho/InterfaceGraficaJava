package trabalhoprog2.controller;

import java.util.ArrayList;
import java.util.List;

import trabalhoprog2.model.Produto;

public class ProdutoController {
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProdutos(String nome, double preco, int qtd) 
    {
        try
        {
            if (preco < 0) {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
            if (qtd < 0) {
                throw new IllegalArgumentException("A quantidade não pode ser negativa.");
            }

            produtos.add(new Produto(nome, preco, qtd));
        }

        catch(NullPointerException e)
        {
            System.out.println("ERRO!!! Um dos parâmetros é nulo");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("ERRO!!! " + e.getMessage());
        }
    }

    public List<Produto> listaProds()
    {
        return produtos;
    }
}
