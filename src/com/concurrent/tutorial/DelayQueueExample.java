package com.concurrent.tutorial;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {

	public static void main(String[] args) throws InterruptedException {
        DelayQueue queue = new DelayQueue();

        Delayed element1 = new DelayedElement(1,4000);
        Delayed element3 = new DelayedElement(1,2000);
        queue.put(element1);
        queue.put(element3);
        Delayed element2 = queue.take();
        System.out.println(element2);
        
        element2 = queue.take();
        System.out.println(element2);
    }
	
	static class DelayedElement implements Delayed
	{
		int startTime;
		int data;
		
		public DelayedElement(int data, int startTime)
		{
			this.data=data;
			this.startTime=startTime;
		}

		@Override
		public int compareTo(Delayed arg0) {
			if(this.startTime<((DelayedElement)arg0).startTime)
				return -1;
			if(this.startTime>((DelayedElement)arg0).startTime)
				return 1;
			
			return 0;
		}

		@Override
		public long getDelay(TimeUnit arg0) {
			long diff=this.startTime-1000;
			this.startTime=(int)diff;
			System.out.println(diff);
			return diff;
		}

		@Override
		public String toString() {
			return "DelayedElement [startTime=" + startTime + ", data=" + data + "]";
		}
		
	}
}
