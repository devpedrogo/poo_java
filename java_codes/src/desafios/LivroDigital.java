package java_codes.src.desafios;

public class LivroDigital extends Livro {
    private String formato;
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, String formato, double tamanhoArquivo) {
        super(titulo, autor);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Formato: " + formato);
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " MB");
    }

}
