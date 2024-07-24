package heranca;

public class ContaFisica extends Conta {

    private String CPF;

    ContaFisica(String numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    public String getCPF() {
        return CPF;
    }
}
