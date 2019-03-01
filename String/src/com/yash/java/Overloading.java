package com.yash.java;

public class Overloading {
	
	public void add(int a, float b) {
	System.out.println("-----add int to float-----"+(a+b));
  }
	public void add(float a, int b) {
	System.out.println("-----add float to int-----"+(a+b));
	}
	
	public void add(int a, int b) {
	System.out.println("-----add int to int-----"+(a+b)); 
	}
	
	public void add(float a, float b) {
	System.out.println("-----add float to float-----"+(a+b));
	}
}