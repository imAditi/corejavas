package com.yash.thread;

public class ThreadTest1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadDemo1 threadDemo = new ThreadDemo1();
		threadDemo.start();
	}

}
class ThreadDemo1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}