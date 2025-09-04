package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.view.BillView;

class BillViewTest {

	@Test
	void getTextTest() {
		Bill bill = new Bill();
		BillItem bacon = new BillItem("bacon", 1.50);
		BillItem eggs = new BillItem("eggs", 1.20);
		bill.addItem(bacon);
		bill.addItem(eggs);
		BillView billView = new BillView();
		String receipt = billView.getText(bill);
		String expected = "ITEMS\r\n"
				+ "bacon - 1.5\r\n"
				+ "eggs - 1.2\r\n"
				+ "\r\n"
				+ "SUBTOTAL - $2.7\r\n"
				+ "TAX - $0.27\r\n"
				+ "TIP - $0.54\r\n"
				+ "TOTAL - $3.5100000000000002";
		assertEquals(expected, receipt);
	}

}
