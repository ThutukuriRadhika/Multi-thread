package com.Thread;

public class Prime  extends Thread{
	int n;
	public Prime(int n,String name)
	{
		super(name);
		this.n=n;
	}
	public void run()
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+"is not a prime number");
				return;
			}
		}
		System.out.println(n+"is a prime number");
	}
}