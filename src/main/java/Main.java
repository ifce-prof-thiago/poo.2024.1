import produtos.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o preço do produto 1: ");
        p1.alterarPreco(ler.nextDouble());

        System.out.println("Digite o preço do produto 2: ");
        p2.alterarPreco(ler.nextDouble());

        System.out.println("Preço do produto 1: " + p1.preco());
        System.out.println("Preço do produto 2: " + p2.preco());

    }

}
