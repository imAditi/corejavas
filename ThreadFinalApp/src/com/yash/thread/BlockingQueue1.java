package com.yash.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue1 {
public static void main(String[] args) throws InterruptedException {
	BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
	queue.put("aditi");
	queue.put("amisha");
	queue.put("arihant");
	queue.take();
	queue.add("ashwini");
	queue.offer("amee");
	queue.remove("ashwini");
	System.out.println(queue);
	
}
}
