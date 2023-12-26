package com.Thread;
public class C3 {
public static void main(String[] args) {
	Multi1 monkey =new Multi1(7,"Monkey");
	monkey.start();
	Multi1 donkey=new Multi1(19,"Donkey");
	donkey.start();
	Multi1 tiger=new Multi1 (15,"Tiger");
	tiger.start();
}
}
