package heranca;

public class ContaFisica extends Conta {

    private String CPF;

    ContaFisica(String numero, String titular, String CPF, float saldo) {
        super(numero, titular, saldo);
        this.CPF = CPF;
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("\uD83E\uDD70CPF: " + CPF);
    }

}
