package com.yash.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {
public static void main(String[] args) {
	Passenger passenger1 = new Passenger();
	Passenger passenger2 = new Passenger();
	passenger1.start();
	
}
}

class Passenger extends Thread {
	int ticket = 1;
	Lock lock = new ReentrantLock();
	@Override
	public void run() {
		lock.lock();
	if(ticket == 1) {
		System.out.println("ticket is booked");
	}
	else {
		System.out.println("ticket is not booked");
		lock.unlock();
	}
	}
}