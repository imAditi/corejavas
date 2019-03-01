package com.yash.threads.running;

public class FirstTask extends Thread {
	private static int count = 0;
	private int id;
	@Override
	public void run() {
		for(int i = 0; i < 3; i ++) {
			System.out.println("id : "+id+" : CountDown : "+i);
		}
	}
	public FirstTask() {
		id = ++count;
		this.start();
	}
}
