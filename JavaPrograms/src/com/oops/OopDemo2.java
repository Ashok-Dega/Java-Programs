package com.oops;

public class OopDemo2 {

	public static void main(String[] args) {
		E e = new E();
		e.m2();
		
	}
}

class D
{
	
	public int m1()
	{
		return 10;
	}
}
class E
{
	D d = new D();
	
	public void m2()
	{
		int f=d.m1();
		System.out.println("returning value is "+f);
		int g=f+90;
		System.out.println(g);
	}
}
