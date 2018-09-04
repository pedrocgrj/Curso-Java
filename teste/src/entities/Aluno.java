package entities;

public class Aluno {
	
	public double av1;
	public double av2;
	public double av3;
	public double finalGrade;
	
	public double media() {
		return (av1 + av2 + av3)/3;
	}
	
	public void avalia() {
		if (media()>60.00) {
			System.out.println("PASS!");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n ", 60.00-media());
		}
	}
}
