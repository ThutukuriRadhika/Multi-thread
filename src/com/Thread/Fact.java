package com.Thread;

public class Fact  extends Thread{
	int n;
	public Fact (int n,String name) {
		super (name);
		this.n=n;
	}
	@Override
	public void run()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		fact*=i;
		System.out.println("Factorial of"+n+"is"+fact);
	}

}
