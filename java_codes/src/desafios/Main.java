package java_codes.src.desafios;

public class Main {
    public static void main(String[] args) {
        // Produto produto = new Produto("Notebook", 2500.00);
        // produto.mostrarInformacoes();

        // Eletronico eletronico = new Eletronico("Smartphone", 1500.00, "Samsung");
        // eletronico.mostrarInformacoes();

        // Aluno aluno = new Aluno("João", 20, 12345);
        // aluno.mostrarInformacoes();

        // Livro livro = new Livro("O Alquimista", "Paulo Coelho");
        // livro.mostrarInformacoes();

        // LivroDigital livroDigital = new LivroDigital("O Alquimista", "Paulo Coelho", "PDF", 2.5);
        // livroDigital.mostrarInformacoes();

        // Bicicleta bicicleta = new Bicicleta("Caloi", 2020, "Mountain Bike");
        // bicicleta.mostrarInformacoes();

        // ContaBancaria contaBancaria1 = new ContaBancaria(12345, 34.75);
	    // contaBancaria1.mostrarInformacoes();   

        // contaBancaria1.setSaldo(9000.99);
	    // contaBancaria1.mostrarInformacoes();

        
        // ContaPoupanca contaPoupanca1 = new ContaPoupanca(78890, 307.00, 5.0);
	    // contaPoupanca1.mostrarInformacoes();

        // contaPoupanca1.setSaldo(5000.00);
        // contaPoupanca1.calcularRendimento();
        // contaPoupanca1.mostrarInformacoes();

        Util util = new Util();
        int maiorInt = util.maiorValor(10, 20);
        System.out.println("Maior valor (int): " + maiorInt);
        double maiorDouble = util.maiorValor(15, 10.3);
        System.out.println("Maior valor (double): " + maiorDouble);
        String maiorString = util.maiorValor("Java", "Python");
        System.out.println("Maior valor (String): " + maiorString);

    }
}
