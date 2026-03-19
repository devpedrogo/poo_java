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

        // Util util = new Util();
        // int maiorInt = util.maiorValor(10, 20);
        // System.out.println("Maior valor (int): " + maiorInt);
        // double maiorDouble = util.maiorValor(15, 10.3);
        // System.out.println("Maior valor (double): " + maiorDouble);
        // String maiorString = util.maiorValor("Java", "Python");
        // System.out.println("Maior valor (String): " + maiorString);

        // StringUtils stringUtils = new StringUtils();
        // String resultado1 = stringUtils.concat("Olá, ", "mundo!");
        // System.out.println(resultado1);
        // String resultado2 = stringUtils.concat("Número: ", 42);
        // System.out.println(resultado2);
        // String resultado3 = stringUtils.concat(2024, " é o ano atual. ", "Vamos aprender Java!");
        // System.out.println(resultado3);

        CartaoCredito cartaoCredito = new CartaoCredito("1234-5678-9012-3456");
        cartaoCredito.processarPagamento(150.00);
        Boleto boleto = new Boleto("23793.38128 60000.000000 00000.000000 1 67890000015000");
        boleto.processarPagamento(150.00);  
        

    }
}
