package java_codes.src.desafios;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00);
        produto.mostrarInformacoes();

        Eletronico eletronico = new Eletronico("Smartphone", 1500.00, "Samsung");
        eletronico.mostrarInformacoes();

        Aluno aluno = new Aluno("João", 20, 12345);
        aluno.mostrarInformacoes();

        Livro livro = new Livro("O Alquimista", "Paulo Coelho");
        livro.mostrarInformacoes();

        LivroDigital livroDigital = new LivroDigital("O Alquimista", "Paulo Coelho", "PDF", 2.5);
        livroDigital.mostrarInformacoes();

    }
}
