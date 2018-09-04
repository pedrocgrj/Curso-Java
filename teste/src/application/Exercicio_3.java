package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.av1 = sc.nextDouble();
		aluno.av2 = sc.nextDouble();
		aluno.av3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n",aluno.media());
		aluno.avalia();
		sc.close();
	}

}
