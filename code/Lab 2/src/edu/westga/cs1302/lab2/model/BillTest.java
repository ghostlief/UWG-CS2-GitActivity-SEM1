package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BillTest {

	@Test
	void addItemTest() {
		Bill bill = new Bill();
		BillItem item = new BillItem("name", 1.99);
		bill.addItem(item);
		assertEquals("name", bill.getItems().get(0).getName());
		assertEquals(1.99, bill.getItems().get(0).getAmount());
	}
}
