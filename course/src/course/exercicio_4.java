package course;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in); minha solução

		System.out.print("enter n:  ");
		int flag = sc.nextInt();
		while (flag < 0) {
			System.out.printf("Enter a positive number: ");
			flag = sc.nextInt();
		}
		System.out.print("How many integer numbers are you going to enter?  ");
		int n = sc.nextInt();

		float soma = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			float digitado = sc.nextFloat();
			soma += digitado;
		}
		System.out.println("Soma = " + soma);

		sc.close();*/
		
		//do professor
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		while (n <= 0) {
		System.out.print("N must be positive! Try again: ");
		n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
		System.out.print("Value #" + i + ": ");
		int x = sc.nextInt();
		if (x > higher) {
		higher = x;
		}
		}
		System.out.println("Higher = " + higher);
		sc.close();

	}
}
