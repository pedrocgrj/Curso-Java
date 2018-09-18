package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class BankAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();		
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		Account account = new Account(numeroConta, nome);

		System.out.print("Is there na initial holder (y/n)? ");
		String leitura = sc.nextLine();	
		
		if (leitura == "y") {
			System.out.println("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			account.adicionaSaldo(saldo);
		 }
		
		System.out.println();
		System.out.println("Accoutn data:");
		System.out.print("");
		System.out.println("Updated account Data: " + account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double saldo = sc.nextDouble();
		account.adicionaSaldo(saldo);
		
		System.out.println("Updated account Data: ");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		saldo = sc.nextDouble();
		account.removeSaldo(saldo);
		
		System.out.println("Updated account Data: ");
		System.out.println(account.toString());

		sc.close();

	}

}
