package heranca;

public class ContaJuridica extends Conta {

    private String CNPJ;

    ContaJuridica(String numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    public void realizarEmprestimo(float valor) {
        depositar(valor);
    }


}
