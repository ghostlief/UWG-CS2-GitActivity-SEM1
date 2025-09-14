package edu.westga.cs1302.bill.model;

/** Calculates items within a BillItem array
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class BillCalculator {
	private static double subTotal = 0.0;
	
	/** its a method
	 * @param bill a Bill object 
	 * @return subTotal a double representing the sub total of the sum of the bill items in an array
	 */
	public static double calculateSubtotal(Bill bill) {
		for (BillItem item : bill.getItems()) {
			subTotal += item.getAmount();
		}
		return subTotal;
	}
	
	/** calculates the tax
	 * @return the tax 
	 */
	public static double calculateTax() {
		return subTotal * Bill.TAX_RATE;
	}

}
