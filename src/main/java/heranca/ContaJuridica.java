package heranca;

public class ContaJuridica extends Conta {

    private String CNPJ;

    ContaJuridica(String numero, String titular, String CNPJ, float saldo) {
        super(numero, titular, saldo);
        this.CNPJ = CNPJ;
    }

    public void realizarEmprestimo(float valor) {
        depositar(valor);
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("\uD83E\uDD70CNPJ: " + CNPJ);
    }

}
