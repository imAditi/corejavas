package com.yash.thread;

public class ThreadExample {
	static int workdone;

	public static void main(String[] args) {
		Worker worker1 = new Worker();
		worker1.setName("Aditi");
		worker1.start();
		Worker worker2 = new Worker();
		worker2.setName("Chitra");
		worker2.start();
	}

	static class Worker extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " is working " + " on task " + (i + 1));
			workdone++;
		}
		System.out.println(Thread.currentThread().getName()+"work completed");
	}
}
}
