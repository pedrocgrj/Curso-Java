package entities;

public class Account {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Account(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Account(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void adicionaSaldo(double saldo) {
		this.saldo += saldo;
	}
	public void taxaSaldo() {
		this.saldo -= 5.00;
	}
	public void removeSaldo(double saldo) {
		this.saldo -= saldo;
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
