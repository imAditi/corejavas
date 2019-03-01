package com.yash.threads.running;

public class Thread1 extends Thread {
	private static int count = 0;
	private static int id;
	@Override
	public void run() {
		for(int i = 0; i < 3; i ++) {
			System.out.println("<id : "+id+" : CountDown : >"+i);
		}
	}
	public Thread1() {
		id = ++count;
		
	}

}
