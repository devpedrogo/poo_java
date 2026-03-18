package java_codes.src.desafios;

public class ContaBancaria{

	private int numeroConta;
	private double saldo;

	public ContaBancaria(int numeroConta, double saldo){
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta(){
		return this.numeroConta;
	}

	public void setNumeroConta(int numeroConta){
		this.numeroConta = numeroConta;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public void mostrarInformacoes(){
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
}

