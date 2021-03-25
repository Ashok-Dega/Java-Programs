package com.oops;

public class ConstructorDemo {
	
	int a;
	String b;
	ConstructorDemo(int a, String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+"---"+b);
		
		
	}
	
	public  void logic(int a, String b)
	{
		this.a= a;
		this.b=b;
		System.out.println(a+"--"+b);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo(100, "ashok");
	}

}



