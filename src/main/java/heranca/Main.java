package heranca;

public class Main {

    public static void main(String[] args) {

        Conta x = new ContaJuridica(
                "001 00897-3",
                "Alice",
                "0220229039098-0/0001-90",
                1_000_000f
        );

        x.depositar(1000);
        x.sacar(10_000);

        x.exibirInfos();

    }

}
