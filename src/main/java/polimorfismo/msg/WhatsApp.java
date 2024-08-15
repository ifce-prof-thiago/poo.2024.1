package polimorfismo.msg;

public class WhatsApp extends Mensagem {

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem via WhatsApp");
    }

}
