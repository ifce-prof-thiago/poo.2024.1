import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto p1 = new Produto();

        var ler = new Scanner(System.in);
        System.out.println("Digite os dados do produto: ");

        System.out.print("Nome: ");
        p1.nome = ler.nextLine();

        System.out.print("Preço: ");
        p1.preco = ler.nextDouble();

        System.out.print("Quantidade em estoque: ");
        p1.qtd = ler.nextInt();

        System.out.printf("Dados do produto: %s, $ %.2f, %d und, Total: $ %.2f%n", p1.nome, p1.preco, p1.qtd, p1.qtd * p1.preco);

        System.out.print("Forneça a quantidade de produtos que deseja adicionar: ");
        var adc = ler.nextInt();
        p1.adicionarQuantidadeEmEstoque(adc);

        System.out.printf("Dados atualizados: %s, $ %.2f, %d und, Total: $ %.2f%n", p1.nome, p1.preco, p1.qtd, p1.qtd * p1.preco);

        System.out.print("Forneça a quantidade de produtos que deseja remover: ");
        var remove = ler.nextInt();
        p1.removerQuantidadeDoEstoque(remove);

        System.out.printf("Dados atualizados: %s, $ %.2f, %d und, Total: $ %.2f%n", p1.nome, p1.preco, p1.qtd, p1.qtd * p1.preco);

    }

}
