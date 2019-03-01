package com.yash.threads.running;

public class ThreadMain1 {
	public static void main(String args[]) {
		System.out.println("----main starts-------");
		new Thread1().start();
		Thread t = new Thread1();
		t.start();
		System.out.println("------main ends-------");
	}
}
