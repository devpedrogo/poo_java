package java_codes.src.desafios;

public class SMS extends Notificacao {
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para: " + numero);
        System.out.println("Mensagem: " + mensagem);
    }

}
