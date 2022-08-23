package com.aurionpro.model;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.aurionpro.test.Threads;

public class ThreadExecutor {
	static final int MAX_T = 4;

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(MAX_T);

		service.schedule(new Threads(1), 5, TimeUnit.SECONDS);
		service.schedule(new Threads(2), 5, TimeUnit.SECONDS);
		service.schedule(new Threads(3), 10, TimeUnit.SECONDS);
		service.schedule(new Threads(4), 5, TimeUnit.SECONDS);
//		service.schedule(new Threads(5), 5, TimeUnit.SECONDS);
//		service.schedule(new Threads(6), 10, TimeUnit.SECONDS);
		service.shutdown();

//		Runnable r1 = new Threads(1);
//		Runnable r2 = new Threads(2);
//		Runnable r3 = new Threads(3);
//		Runnable r4 = new Threads(4);
//		Runnable r5 = new Threads(5);
//		Runnable r6 = new Threads(6);
//
//		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
//
//		pool.execute(r1);
//		pool.execute(r2);
//		pool.execute(r3);
//		pool.execute(r4);
//		pool.execute(r5);
//		pool.execute(r6);
//
//		pool.shutdown();

	}

}
