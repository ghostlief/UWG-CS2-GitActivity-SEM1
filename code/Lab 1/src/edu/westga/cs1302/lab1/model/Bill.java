package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2025
 */

public class Bill {
	private static final double TIP = 0.2;
	private static final double TAX = 0.1;
	private ArrayList<BillItem> items;
	private double tax = 0.0;
	private double tip = 0.0;
	private double subTotal = 0.0;
	private double total = 0.0;
	
	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	}
	
	/** Gets items
	 * @return items 
	 */
	public ArrayList<BillItem> getItems() {
		return this.items;
	}

	/** Gets tax
	 * @return tax the tax added to total
	 */
	public double getTax() {
		return this.tax;
	}

	/** Gets tip
	 * @return tip the tip added to the total
	 */
	public double getTip() {
		return this.tip;
	}

	/** Gets subTotal
	 * @return subTotal the total of the items
	 */
	public double getSubTotal() {
		return this.subTotal;
	}
	
	/** Gets total
	 * @return total the sum of subTotal, tip, and tax
	 */
	public double getTotal() {
		return this.total;
	}

	/** Calculates Bill tips, tax, and totals
	 * 
	 * 
	 */
	public void calculateBill() {
		for (BillItem item : this.getItems()) {
			this.subTotal += item.getAmount();
		}
		this.tax = this.getSubTotal() * TAX;
		this.tip = this.getSubTotal() * TIP;
		this.total = this.getSubTotal() + this.getTip() + this.getTax();
	}
	/** Adds the item to the bill
	 * 
	 * @precondition item != null
	 * @postcondition item is added to the list of items in the bill
	 * 
	 * @param item the item to be added to the bill
	 */
	
	public void addItem(BillItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		this.items.add(item);
	}
	
}
