package com.oops;

public class OverridingDemo {
	
	public static void main(String[] args) {
		Test tc = new Test();
		tc.animal();
		
	}
			

}
 class Test
{
	
public void animal()
{
	System.out.println("Parent animal");
}
	
}

abstract class TestChild extends Test
{

	

abstract public void animal() ;
	
}