package com.concurrent.tutorial;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(2);
		
		new Thread(new Waiter(latch)).start();
		new Thread(new Decrementer(latch)).start();
	}
	
	static class Waiter implements Runnable
	{
		CountDownLatch latch = null;
		public Waiter (CountDownLatch latch){this.latch=latch;}
		@Override
		public void run() {
			try {
				System.out.println("Before release");
				latch.await();
				System.out.println("After release");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

	static class Decrementer implements Runnable
	{
		CountDownLatch latch = null;
		public Decrementer (CountDownLatch latch){this.latch=latch;}
		@Override
		public void run() {
			latch.countDown();
			System.out.println("Decrement1");
			latch.countDown();
			System.out.println("Decrement2");
		}
		
	}
}
