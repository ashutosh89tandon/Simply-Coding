package com.concurrent.tutorial;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MergeSortUsingForkAndJoin extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	private Integer[] a;
	int high;
	int low;
	
	@Override
	protected void compute()
	{
		if(high>low)
		{
			int mid=(high+low)/2;
			forkTask(mid);
			joinTask(mid);
		}
	}

	private void joinTask(int mid) 
	{
		int n1=mid-low+1;
		int n2=high-mid;
		int x[]=new int[n1];
		int y[]=new int [n2];
		int index=low;
		for(int i=0;i<n1;i++){x[i]=a[index++];}
		index=mid+1;
		for(int i=0;i<n2;i++){y[i]=a[index++];}
		int i=0;
		int j=0;
		int k=low;
		
		while(i<n1 && j<n2)
		{
			if(x[i]<=y[j])
				a[k++]=x[i++];
			else if(x[i]>y[j])
				a[k++]=y[j++];
		}
		
		while(i<n1)
		{
			a[k++]=x[i++];
		}
		
		while(j<n2)
		{
			a[k++]=y[j++];
		}
	}

	private void forkTask(int mid) 
	{
		new MergeSortUsingForkAndJoin(a, low, mid).invoke();
		new MergeSortUsingForkAndJoin(a, mid+1, high).invoke();
	}

	public Integer[] getA() {
		return a;
	}

	public void setA(Integer[] a) {
		this.a = a;
	}

	public MergeSortUsingForkAndJoin(Integer[] a,int low,int high) {
		super();
		this.a = a;
		this.low=low;
		this.high=high;
	}
	
	public static void main(String[] args) {
		ForkJoinPool pool=new ForkJoinPool(10);
		Integer a[]={5,1,7,4,2,3};
		pool.invoke(new MergeSortUsingForkAndJoin(a, 0, 5));
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ->");
		}
	}

}
