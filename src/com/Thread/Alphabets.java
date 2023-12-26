package com.Thread;

public class Alphabets implements Runnable{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(char ch='A';ch<='Z';ch++)
			System.out.print(ch+"");
	}
	

}
