package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConversaoMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How manu dollars will be bought? ");
		double dollarsBought = sc.nextDouble();
		
		double result = CurrencyConverter.convert(priceDollar, dollarsBought);
		System.out.printf("Amount to be paid in reais = %.2f%n",result);
		
		sc.close();
	}

}
