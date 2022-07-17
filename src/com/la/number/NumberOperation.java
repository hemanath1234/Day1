package com.la.number;

public class NumberOperation {
	int a=10;
	int b=20;
	int c=30;
	public void methodinfo() {
		System.out.println("addtion"+(a+b+c));
		System.out.println("su"+(a-b-c));
		System.out.println("mul"+(a*b*c));
		
	}
public static void main(String[] args) {
	NumberOperation s =new NumberOperation();
	s.methodinfo();
	System.out.println(s.a+s.b+s.c);
	System.out.println(s.a*s.b*s.c);
	System.out.println(s.a-s.b-s.c);
	
}
}
