public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salarioBase;
    }

    public void setSalario(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public void calcularSalario(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }
}
