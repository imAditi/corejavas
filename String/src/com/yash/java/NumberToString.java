package com.yash.java;

public class NumberToString {
	double number;

	public void setNumber(double number) {
		this.number = number;
	}
	
	public String numberOutputInString() {
		String string = String.valueOf(number);
			
			int i = 0;
			while(string.charAt(i)!='.') {
				i++;
			}
			String string1 = i + " digits before decimals ";
			return string1;
		}
}

