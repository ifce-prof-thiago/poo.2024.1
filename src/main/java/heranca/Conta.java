package heranca;

public class Conta {

    private final String numero;
    private final String titular;
    private float saldo;

    Conta(String numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(float valor) {

        if (valor <= 0)
            throw new IllegalArgumentException("Valor inválido");

        saldo = saldo + valor;
    }

    public void sacar(float valor) {

        if (valor <= 0)
            throw new IllegalArgumentException("Valor inválido");

        if (saldo < valor)
            throw new IllegalArgumentException("Saldo insuficiente");

        saldo = saldo - valor;
    }

    public void exibirInfos() {
        System.out.println("------------------------");
        System.out.println("TITULAR: " + titular);
        System.out.println("------------------------");
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("------------------------");
    }

}
