package java_codes.src.desafios;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão de crédito: " + numeroCartao + " no valor de: " + valor);
    }
}