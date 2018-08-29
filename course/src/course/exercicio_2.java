package course;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your Full Name");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int manyBedrooms = sc.nextInt(); 
		System.out.println("Enter product price");
		double productPrice = sc.nextDouble();
		System.out.println("Enter you last name, age and height (same line)");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println("----Saída de Dados----");
		System.out.println(name);
		System.out.println(manyBedrooms);
		System.out.println(productPrice);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
	}

}
