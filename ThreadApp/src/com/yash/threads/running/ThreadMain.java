package com.yash.threads.running;

public class ThreadMain {
public static void main(String args[]) {
	System.out.println("------main starts--------");
	new ThreadDemo();
	new ThreadDemo();
	new ThreadDemo();
	System.out.println("-----main ends-----");
}
}
