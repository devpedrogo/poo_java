package java_codes.src.desafio_empresa;
public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalario() + bonus;
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Final: " + salarioFinal);
    }
}
