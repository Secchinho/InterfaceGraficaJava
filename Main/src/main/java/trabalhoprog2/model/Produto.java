package trabalhoprog2.model;

public class Produto {

    // Atributos dos Produtos
    private String nome;
    private double preco;
    private int qtd;

    // Construtor para inicializar um produto
    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    // Getters e Setters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    // Método toString para representar o objeto como uma string
    @Override
    public String toString(){
        String saida = ""; 
        saida += "Nome: " + nome + "    Preço: " + preco + "    Quantidade: " + qtd + "\n";
        return saida;
    }
}
