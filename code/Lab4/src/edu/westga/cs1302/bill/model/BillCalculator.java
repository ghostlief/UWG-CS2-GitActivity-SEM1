package edu.westga.cs1302.bill.model;

/** Calculates items within a BillItem array
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class BillCalculator {
	private static double subTotal = 0.0;
	
	/** its a method
	 * @precondition BillItem[] itemArray does not contain null values
	 * 
	 * @param itemArray an array of BillItem objects
	 * @return subTotal a double representing the sub total of the sum of the bill items in an array
	 */
	public static double calculateSubtotal(BillItem[] itemArray) {
		for (BillItem item : itemArray) {
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
	
	/** calculates tip amount
	 * @return the tip amount based on the subtotal and tip rate
	 */
	public static double calculateTip() {
		return subTotal * Bill.TIP_RATE;
	}

	/** calculates the bill total
	 * @return the total of the BillItems in the Bill array
	 */
	public static double calculateTotal() {
		return subTotal + calculateTip() + calculateTax();
	}
}
