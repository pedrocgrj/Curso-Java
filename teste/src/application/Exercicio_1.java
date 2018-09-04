package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		rectangle.widht = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA: " + rectangle.area());
		System.out.println("PERIMETER: " + rectangle.perimeter());
		System.out.println("DIAGONAL: " + rectangle.diagonal());
		//System.out.print("Altura: "+ rectangle.height + " Largura: " + rectangle.widht);
		
		sc.close();
	}

}
