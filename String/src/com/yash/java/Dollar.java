package com.yash.java;
public class Dollar extends Currency {
	public Dollar() {
		super();
	}
	public Dollar(double amount) {
		super(amount);
	}
	public void conversion(double amount, Currency convertTo) {
		Rupee rupee = new Rupee();
		if(rupee.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Dollar to Rupee");
		}
		Euro euro= new Euro();
		if(euro.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Dollar to Euro");
		}
	}
}