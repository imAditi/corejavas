package com.yash.threads.running;

public class FirstApproach {
	public static void main(String args[]) {
		System.out.println("------main starts-----");
		new FirstTask();
		new FirstTask();
		System.out.println("------main ends------");
	}
}