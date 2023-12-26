package com.Thread;

public class C4 {
public static void main(String[] args) {
		Fact red=new Fact(5,"Red");
		Fact green=new Fact(6,"green");
		Prime yellow=new Prime(45,"yellow");
		Prime orange=new Prime(91,"orange");
		Prime white=new Prime(7,"white");
red.start();
green.start();
yellow.start();
orange.start();
white.start();
}
}
