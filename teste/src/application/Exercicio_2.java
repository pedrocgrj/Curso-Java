package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio_2 {

	public static void main(String[] args) {

		Employee employee = new Employee();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("which percentage to increase salary? ");
		int percent = sc.nextInt();
		employee.increaseSalary(percent);
		System.out.println();
		
		System.out.println("Updated data: " + employee);
		sc.close();
	}

}
