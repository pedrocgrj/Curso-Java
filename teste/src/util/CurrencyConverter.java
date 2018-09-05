package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double convert(double priceDollar, double dollarsBought) {
		return (priceDollar * dollarsBought) * IOF;
	}

}
