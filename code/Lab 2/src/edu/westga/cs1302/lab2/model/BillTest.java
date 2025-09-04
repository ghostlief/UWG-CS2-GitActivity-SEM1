package edu.westga.cs1302.lab2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {

	@Test
	void test() {
		Bill bill = new Bill();
		BillItem item = new BillItem("name", 1.99);
		bill.addItem(item);
		assertEquals()
		fail("Not yet implemented");
	}

}
