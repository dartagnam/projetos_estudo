package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double vrDolar(double dolar, double vtReais) {
		return dolar * vtReais * (1.0 + IOF);
	}
	
}
