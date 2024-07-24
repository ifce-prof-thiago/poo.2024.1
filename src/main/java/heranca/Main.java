package heranca;

public class Main {

    public static void main(String[] args) {

        ContaFisica x = new ContaFisica(
                "001 00897-3",
                "Marcandra Rabelo",
                1_000_000f
        );

        x.depositar(600);
        x.sacar(2_000_000);

        System.out.println(x.getTitular());
        System.out.println(x.getNumero());
        System.out.println(x.getSaldo());

    }

}
