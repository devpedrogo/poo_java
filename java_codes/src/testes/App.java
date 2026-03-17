package java_codes.src.testes;
// import java.util.Scanner;
public class App {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Bem-vindo ao programa de soma!");
        
        // System.out.println("Digite seu nome: ");
        // String nome = scanner.nextLine();
        // System.out.println("Olá, " + nome + "! Vamos começar a somar.");

        // System.out.print("Digite o primeiro número: ");
        // int num1 = scanner.nextInt();
        // System.out.print("Digite o segundo número: ");
        // int num2 = scanner.nextInt();
        // int resultado = soma(num1, num2);
        // System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é: " + resultado);
        // scanner.close();

        // 
        
        // Pessoa pessoa1 = new Pessoa();
        // pessoa1.nome = "João";
        // pessoa1.idade = 30;
        // pessoa1.mostrarInformacoes();

        // Funcionario funcionario1 = new Funcionario();
        // funcionario1.nome = "Maria";
        // funcionario1.salario = 5000.0;
        // funcionario1.departamento = "Recursos Humanos";
        // funcionario1.mostrarInformacoes();

        // Carro carro1 = new Carro("Toyota Corolla", 2020);
        // carro1.mostrarInformacoes();

        // carro1.setModelo("Honda Civic");
        // carro1.setAno(2022);
        // carro1.mostrarInformacoes();

        Colaborador colaborador1 = new Colaborador("Carlos", 3000.0);
        colaborador1.mostrarInformacoes();

        Gerente gerente1 = new Gerente("Ana", 8000.0, "Vendas");
        gerente1.mostrarInformacoes();


    }
}
