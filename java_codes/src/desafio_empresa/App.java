package java_codes.src.desafio_empresa;
public class App {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1621.00);
        funcionario1.calcularSalario();

        Gerente gerente1 = new Gerente("Tabata", 2500.00, 250.00);
        gerente1.calcularSalario();

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Pedro", 9000.00, 10.0, 50);
        desenvolvedor1.calcularSalario();
    }


}
