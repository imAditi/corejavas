package com.yash.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTask implements Runnable {
	//Lock lock = new ReentrantLock();
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
