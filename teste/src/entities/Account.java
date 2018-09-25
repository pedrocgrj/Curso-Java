package entities;

public class Account {

	private int numeroConta;
	private String nome;
	private double saldo;

	public Account(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public Account(int numeroConta, String nome, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		adicionaSaldo(saldoInicial);
	}


	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void adicionaSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void removeSaldo(double saldo) {
		this.saldo -= saldo + 5.0;
	}
	

	public String toString() {
		return "Account " 
				+ numeroConta 
				+ ", Holder: " 
				+ nome 
				+ ", Balance: " 
				+ "$" 
				+ String.format("%.2f", saldo);
	}

}
