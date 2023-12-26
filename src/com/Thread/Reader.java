package com.Thread;

public class Reader extends Thread {
Book b;
public Reader(Book b,String name)
{
	super(name);
	this.b=b;
}
@Override
public void run()
{
	for(int i=0;i<b.title.length()-1;i++)
	{
		System.out.print(b.title.charAt(i));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
