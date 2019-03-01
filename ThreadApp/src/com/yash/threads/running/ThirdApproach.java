package com.yash.threads.running;

public class ThirdApproach {
	public static void main(String args[]) {
		System.out.println("------main starts-----");
		new ThirdTask();
		new ThirdTask();
		System.out.println("------main ends------");
	}
}
