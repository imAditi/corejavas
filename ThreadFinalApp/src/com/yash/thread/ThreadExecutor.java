package com.yash.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExecutor {

	public static void main(String[] args) {
		Runnable command = new MyTask();
		ExecutorImpl executor = new ExecutorImpl();

		// for (int i = 0; i < 2; i++) {
		// executor.execute(command);
		// }
		Executor executor1 = Executors.newCachedThreadPool();
		executor1.execute(command);
		ThreadPoolExecutor execService = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		for (int i = 0; i < 4; i++) {
			execService.execute(command);
		}
		execService.setMaximumPoolSize(5);
		for (int i = 0; i < execService.getMaximumPoolSize(); i++) {
			execService.execute(command);
		}
	}

}
