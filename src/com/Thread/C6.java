package com.Thread;

public class C6 {
public static void main(String[] args) {
	Book b=new Book("Romeo-julie","Naman");
	Reader r=new Reader(b,"Reader");
	Writer w=new Writer(b,"Writer","Laila-the Devil");
	r.start();
	w.start();
}
}
