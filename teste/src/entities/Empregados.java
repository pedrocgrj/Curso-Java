package entities;

public class Empregados {
	private int id;
	private String nome;
	private Double salary;

	public Empregados(int id, String nome, Double salary) {
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void bonus(Double salary) {
		this.salary += this.salary * salary /100;
	}
	
	public String toString(){
		return  id
				+", "
				+nome
				+", "
				+String.format("%.2f", salary);
	}
}
