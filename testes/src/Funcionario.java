public class Funcionario {
    String nome;
    double salario;
    String departamento;

    float calcularAumento(float percentual) {
        return (float) (salario * (percentual / 100));
    }

    void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Aumento: " + calcularAumento(10)); // Exemplo de cálculo de aumento de 10%
        System.out.println("Novo salário com aumento: " + (salario + calcularAumento(10)));
    }
}
