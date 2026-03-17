package java_codes.src.testes;
public class Gerente extends Colaborador {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Departamento: " + departamento);
    }

}
