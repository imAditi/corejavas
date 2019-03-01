package com.yash.java;

import com.yash.java.CalculateCurrency;

public class CalculateCurrencyTest {
	public static void main(String args[]) {
		
	CalculateCurrency calculate = new CalculateCurrency(1000.00, new Rupee(), new Euro());
		calculate.conversion(1000.00,new Euro());
		
		CalculateCurrency calculate1 = new CalculateCurrency(2000.00, new Rupee(), new Dollar());
		calculate1.conversion(2000.00,new Dollar());
		
		//CalculateCurrency calculate2 = new CalculateCurrency(1000, new Dollar(), new Euro());
		//calculate2.conversion(1000,new Euro());
	}
}
