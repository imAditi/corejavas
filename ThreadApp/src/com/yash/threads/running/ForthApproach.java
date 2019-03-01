package com.yash.threads.running;

public class ForthApproach {
	public static void main(String args[]) {
		System.out.println("------main starts-----");
		new Thread(new ForthTask()).start();
		Thread t = new Thread(new ForthTask());
		t.start();
		System.out.println("------main ends------");
	}
}
