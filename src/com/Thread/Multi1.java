package com.Thread;

public class Multi1 extends Thread {
int n;
public Multi1 (int n,String name)
{
super(name);
this.n=n;
}
@Override
public void run()
{
	for(int i=1;i<10;i++)
	{
		System.out.println(i+"*"+n+"="+""+getName());
	}
}
}
