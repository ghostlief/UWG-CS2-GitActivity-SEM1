package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Implements text generation
 * 
 * @author Aubrey
 * @version Fall 2025
 * 
 */
public class BillText {

	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param bill the bill to be viewed
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText(Bill bill) {
		String text = "ITEMS" + System.lineSeparator();
		for (BillItem item : bill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + bill.getSubTotal() + System.lineSeparator();
		text += "TAX - $" + bill.getTax() + System.lineSeparator();
		text += "TIP - $" + bill.getTip() + System.lineSeparator();
		text += "TOTAL - $" + (bill.getTotal());
		
		return text;
	}
}
