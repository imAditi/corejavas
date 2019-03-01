package com.yash.threads.running;

public class SecondApproach {
	public static void main(String args[]) {
		System.out.println("------main starts-----");
		new SecondTask().start();
		Thread t = new SecondTask();
		t.start();
		System.out.println("------main ends------");
	}
}
