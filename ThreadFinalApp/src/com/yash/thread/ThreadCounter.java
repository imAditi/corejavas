package com.yash.thread;

public class ThreadCounter {
	public static void main(String[] args) {
		ThreadSample1 threadSample1 = new ThreadSample1();
		ThreadSample2 threadSample2 = new ThreadSample2();
		Thread thread1 = new Thread(new ThreadSample1());
		Thread thread2 = new Thread(new ThreadSample2());
		thread1.start();
		thread2.start();
	}
}

class ThreadSample1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().toString() + i);
		}
	}
}

class ThreadSample2 implements Runnable {
	@Override
	public void run() {
		for (int j = 0; j < 5; j++) {
			System.out.println(Thread.currentThread().toString() + j);
		}
	}
}
