package com.yash.threads.running;

import java.util.concurrent.TimeUnit;

public class SecondTask extends Thread {
	private static int count = 0;
	private int id;
	@Override
	public void run() {
		for(int i = 0; i < 3; i ++) {
			System.out.println("<id : "+id+" : CountDown : >"+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public SecondTask() {
		id = ++count;
	}
}
