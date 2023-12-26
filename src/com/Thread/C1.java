package com.Thread;

public class C1 {
public static void main(String[] args) {
	MyThread t0=new MyThread();
	t0.start();//Thread-0 is in runnable stage
	MyThread t1=new MyThread();
	t1.start();//Thread-1 is in runnable stage
	//Executed by main thread
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	
}
}
