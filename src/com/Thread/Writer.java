package com.Thread;

public class Writer extends Thread{
	Book b;
	String newTitle;
	public Writer(Book b,String newTitle,String name)
	{
		super(name);
		this.b=b;
		this.newTitle=newTitle;
	}
	@Override
	public void run()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.title=newTitle;
	}

}
