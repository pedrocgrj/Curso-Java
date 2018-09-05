package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//sem orientação
	/*	double xA, xB, xC, yA, yB, yC; 
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangule X area: %.4f%n",areaX);
		System.out.printf("Triangule Y area: %.4f%n",areaY);
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}*/
		
			/*Triangle x,y;
			
			x = new Triangle();
			y = new Triangle();
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			
			double areaX = x.area();
			
			double areaY = y.area();
			
			System.out.printf("Triangule X area: %.4f%n",areaX);
			System.out.printf("Triangule Y area: %.4f%n",areaY);
			if(areaX > areaY) {
				System.out.println("Larger area: X");
			}else {
				System.out.println("Larger area: Y");
			}*/
		
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = circumference(radius);
			double v = volume(radius);
			
			System.out.printf("Circumference: %.2f%n",c);
			System.out.printf("Volume: %.2f%n",v);
			System.out.printf("PI Value: %.2f%n",PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
