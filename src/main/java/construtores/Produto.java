package construtores;
public class Produto {
    private String nome;
    private Double preco;
    private int qtd;

    Produto(String nome, Double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: "+ this.qtd);
    }
}
