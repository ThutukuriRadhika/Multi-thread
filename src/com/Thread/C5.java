package com.Thread;

public class C5 {
	public static void main(String[] args) {
		Alphabets a=new Alphabets();
		Thread t1=new Thread(a,"Eagle");
		t1.start();
		Thread t2=new Thread(new Alphabets(),"parrot");
		t2.start();
	}
}
