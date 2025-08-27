package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
	
        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculateTax(subtotal);
		
		double total = subtotal + tax;
		String sb = ReceiptFormatter.formatter(order, subtotal, tax, total);
		return sb.toString();

	}
}
