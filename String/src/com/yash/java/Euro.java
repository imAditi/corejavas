package com.yash.java;

public class Euro extends Currency {
	public Euro() {
		super();
	}
	public Euro(double amount) {
		super(amount);
	}
	public void conversion(double amount, Currency convertTo) {
		Dollar dollar = new Dollar();
		if(dollar.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Euro to Dollar");
		}
		Rupee rupee = new Rupee();
		if(rupee.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Euro to Rupee");
		}
	}

	
}
