package java_codes.src.desafios;

public class ContaPoupanca extends ContaBancaria{
	private double taxaRendimento;

	public ContaPoupanca(int numeroConta, double saldo, double taxaRendimento){
		super(numeroConta, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento(){
		return this.taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento){
		this.taxaRendimento = taxaRendimento;
	}

    public void calcularRendimento(){
        double rendimento = getSaldo() * (taxaRendimento / 100);
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento calculado: " + rendimento);
    }

    @Override
	public void mostrarInformacoes(){
        super.mostrarInformacoes();
		System.out.println("Taxa de rendimento: " + taxaRendimento);
        System.out.println("Saldo atualizado: " + getSaldo());
	}
}

