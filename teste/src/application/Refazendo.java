package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Refazendo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregados> empregados = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			empregados.add(new Empregados(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Empregados emp = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		System.out.println();
		
		if(emp == null) {
			System.out.println("this id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double salary = sc.nextDouble();
			emp.bonus(salary);
		}
		
		System.out.println();
		
		for(Empregados obj: empregados) {
			System.out.println(obj);
		}
		sc.close();
	}

}
