package heranca;

public class Main {

    public static void main(String[] args) {

        ContaFisica x = new ContaFisica(
                "001 00897-3",
                "Alice",
                "123.456.789-10",
                1_000_000f
        );

        x.depositar(1000);
        x.sacar(10_000);

        x.exibirInfos();

    }

}
