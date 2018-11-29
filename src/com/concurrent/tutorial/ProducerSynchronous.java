package com.concurrent.tutorial;

import java.util.concurrent.BlockingQueue;

public class ProducerSynchronous implements Runnable
{
	BlockingQueue<String> queue;

	public ProducerSynchronous(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put("Hello");
			Thread.sleep(1000);
			System.out.println("After putting in queue");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
