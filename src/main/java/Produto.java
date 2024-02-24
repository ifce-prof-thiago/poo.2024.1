class Produto {
    String nome;
    Double preco;
    int qtd;

    void adicionarQuantidadeEmEstoque(int valor) {
        qtd += valor;
    }

    void removerQuantidadeDoEstoque(int valor){
        qtd -= valor;
    }
}
