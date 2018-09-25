package application;

import java.util.Scanner;

import entities.Quartos;

public class Exercicio_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];
		System.out.print("How manu rooms will be rested? ");
		int n = sc.nextInt();
		System.out.println("");
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Rent #" + i + ":");
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos (name, email);
			System.out.println();
		}
		
		System.out.print("Busy rooms: ");
		System.out.println();
		for (int i = 0; i<vect.length; i++) {
			if(vect[i]!=null) {
				System.out.println(i + " " + vect[i].toString());				
			}
		}
		
		sc.close();
	}

}
