package com.yash.advanceenumerator;
public enum Currency {
 PENNY(1) {

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "Copper";
	
 }
 },
 
 NICKLE(5) {
	 
	 @Override
	 public String color() {
		 return "Bronze";
	 }
 },
 
 DIME(10) {
	 
	 @Override
	 public String color() {
		 return "Silver";
	 }
 },
 
 QUARTER(10) {
	 
	 @Override
	 public String color() {
		return "Silver"; 
	 }
 };
 
 private int value;
 private Currency(int value) {
	this.value = value;
 }
 public abstract String color();
}




