package polimorfismo.msg;

public class Email extends Mensagem{

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem via Email");
    }
}
