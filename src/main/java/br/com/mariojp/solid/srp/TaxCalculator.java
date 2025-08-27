package br.com.mariojp.solid.srp;

public class TaxCalculator {

	public double calculateTax(double subtotal) {
        double tax = Double.parseDouble(System.getProperty("tax.rate", "0.10"));
        return subtotal * tax;
        
        
        
	}
	
}
