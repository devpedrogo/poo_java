package java_codes.src.desafios;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00);
        produto.mostrarInformacoes();

        Eletronico eletronico = new Eletronico("Smartphone", 1500.00, "Samsung");
        eletronico.mostrarInformacoes();
    }
}
