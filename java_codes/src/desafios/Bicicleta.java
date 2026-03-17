package java_codes.src.desafios;

public class Bicicleta extends Veiculo{
    private String tipo;

    public Bicicleta(String marca, int ano, String tipo) {
        super(marca, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }
}
