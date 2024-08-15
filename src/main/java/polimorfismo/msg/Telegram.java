package polimorfismo.msg;

public class Telegram extends Mensagem {

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem via Telegram");
    }

}
