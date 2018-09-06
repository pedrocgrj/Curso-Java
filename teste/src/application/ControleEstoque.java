package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ControleEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		product.setName("computer");
		System.out.println("novo nome: " + product.getName());
		product.setPrice(1600);
		System.out.println("novo preço: " + product.getPrice());
		System.out.println();
		System.out.println("product Data: " + product);
		
		System.out.println();
		System.out.print("Enter teh number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter teh number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product.toString());
		
		sc.close();
	}

}
