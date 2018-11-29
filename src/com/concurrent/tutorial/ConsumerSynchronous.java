package com.concurrent.tutorial;

import java.util.concurrent.BlockingQueue;

public class ConsumerSynchronous implements  Runnable{
	BlockingQueue<String> queue;

	public ConsumerSynchronous(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		
		try {
			System.out.println(queue.take());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
