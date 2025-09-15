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
	 * @param itemArray an array of BillItem objects
	 * @return the tax 
	 */
	public static double calculateTax(BillItem[] itemArray) {
		return calculateSubtotal(itemArray) * Bill.TAX_RATE;
	}
	
	/** calculates tip 
	 * @param itemArray an array of BillItem objects
	 * @return the tip amount based on the subtotal and tip rate
	 */
	public static double calculateTip(BillItem[] itemArray) {
		return calculateSubtotal(itemArray) * Bill.TIP_RATE;
	}

	/** calculates the bill total
	 * @param itemArray an array of BillItem objects
	 * @return the total of the BillItems in the Bill array
	 */
	public static double calculateTotal(BillItem[] itemArray) {
		return calculateSubtotal(itemArray) + calculateTip(itemArray) + calculateTax(itemArray);
	}
}
