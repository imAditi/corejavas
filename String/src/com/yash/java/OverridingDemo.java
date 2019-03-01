package com.yash.java;

import javax.swing.JOptionPane;

public class OverridingDemo {
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = JOptionPane.showInputDialog("Enter class name");
		Class c = Class.forName("com.yash.java."+className);
		StoreGrandFather storegrandfather= (StoreGrandFather)c.newInstance();
		storegrandfather.accounting();
		
	}
}
