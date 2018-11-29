package com.concurrent.tutorial;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample 
{
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue queue   = new SynchronousQueue();
		new Thread(new ProducerSynchronous(queue)).start();
		new Thread(new ConsumerSynchronous(queue)).start();
	}
}
