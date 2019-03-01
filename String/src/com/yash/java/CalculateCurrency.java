package com.yash.java;

public class CalculateCurrency extends Currency {
	 Currency convertFrom;
	 Currency convertTo;
	double amount;
	public CalculateCurrency(double amount, Currency convertFrom, Currency convertTo) {
		super(amount);
		this.convertFrom = convertFrom;
		this.convertTo = convertTo;
	}
	public void conversion(double amount,Currency convertTo) {
		convertFrom.conversion(amount, convertTo);
	}
}
