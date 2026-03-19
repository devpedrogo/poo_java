package java_codes.src.desafios;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com boleto: " + codigoBarras + " no valor de: " + valor);
    }
}
