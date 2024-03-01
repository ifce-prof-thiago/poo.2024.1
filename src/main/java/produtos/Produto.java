package produtos;

public class Produto {
    public String nome;
    private Double preco;
    public int qtd;

    public void alterarPreco(double valor) {
        if (valor > 0) {
            preco = valor;
        } else {
            System.out.println("Preço inválido");
        }
    }

    public Double preco() {
        return preco;
    }

}
