package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double price = sc.nextDouble();
			vect[i] = new Product (name, price);
		}
		
		Double sum = 0.0;
		
		for (int i = 0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/n;
		System.out.printf("Avarege: %.2f%n", avg);
		sc.close();
	}

}
