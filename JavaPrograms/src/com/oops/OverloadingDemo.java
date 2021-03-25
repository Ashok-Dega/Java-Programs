package com.oops;

public class OverloadingDemo {
	public static void main(String[] args) {
		OverLoad o = new OverLoad();
		int d=o.add(10, 20);
		System.out.println(d);
		float f=o.add(45.45f, 25.45f);
		System.out.println(f);
	//	o.add(34.45f, 34.5); CE
		int g=o.add('a', 'b');
		System.out.println(g);
		
	}

}

class OverLoad
{
	
	  public int add (int a,int b) { int c = a+b; return c;
	  
	  }
	 
	public float add (float a, float b)
	{
		float c = a+b;
		return c;
		
		
	}
	public float add (float a, int b)
	{
		float c = a+b;
		return c;
		
	}
}
