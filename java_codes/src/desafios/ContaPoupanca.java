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

    @Override
	public void mostrarInformacoes(){
        super.mostrarInformacoes();
		System.out.println("Taxa de rendimento: " + taxaRendimento);
	}
}

