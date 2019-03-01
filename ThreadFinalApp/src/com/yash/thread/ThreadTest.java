package com.yash.thread;

public class ThreadTest {
public static void main(String[] args) {
	System.out.println(Thread.currentThread());
	ThreadDemo tDemo = new ThreadDemo();
	Thread thread1 = new Thread(new ThreadDemo());
	Thread thread2 = new Thread(new ThreadDemo());
	thread1.start();
	thread2.start();
	
}
}

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}
	
}