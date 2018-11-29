package com.concurrent.tutorial;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BlockingQueue queue   = new PriorityBlockingQueue();
		Custom obj=new Custom(1);
		Custom obj1=new Custom(2);
		queue.put(obj);
		queue.put(obj1);

		Custom value = (Custom) queue.take();
		System.out.println(value);
		value = (Custom) queue.take();
		System.out.println(value);
	}
	
	static class Custom implements Comparable<Custom>{
		int data;
		
		public Custom(int data)
		{
			this.data=data;
		}

		@Override
		public String toString() {
			return "Custom [data=" + data + "]";
		}

		@Override
		public int compareTo(Custom o) {
			if(this.data<o.data) return -1;
			if(this.data>o.data) return 1;
			return 0;
		}
	}
}
