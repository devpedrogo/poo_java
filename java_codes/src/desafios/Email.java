package java_codes.src.desafios;

public class Email extends Notificacao {
    public void enviarEmail(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }

}
