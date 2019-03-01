package com.yash.java;

public class Rupee extends Currency {
	public Rupee() {
		super();
	}
	public Rupee(double amount) {
		super(amount);
	}
	public void conversion(double amount, Currency convertTo) {
		//Rupee rupee = new Rupee();
		Dollar dollar = new Dollar();
		if(dollar.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Rupee to Dollar"+(amount*0.014));
		}
		Euro euro= new Euro();
		if(euro.getClass().getName() == convertTo.getClass().getName()) {
			System.out.println("Rupee to Euro"+(amount*0.012));
		}
	}
}