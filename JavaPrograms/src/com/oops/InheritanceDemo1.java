package com.oops;

public class InheritanceDemo1 extends C{
	
	public static void main(String[] args) {
		InheritanceDemo1 d1 = new InheritanceDemo1();
		d1.m2();
		
	}

}

class B
{
	public void m1()
	{
		System.out.println("parent-1");
	}
}

class C
{
	public void m2()
	{
		System.out.println("Parent-2");
	}
	
}
