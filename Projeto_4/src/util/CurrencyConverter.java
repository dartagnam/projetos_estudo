package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double valorDolar, double dolar) {
	
	return valorDolar * dolar * (1.0 + IOF);
	}
}
