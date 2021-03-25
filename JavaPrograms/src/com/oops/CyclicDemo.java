package com.oops;

public class CyclicDemo {

	public static void main(String[] args) {
		A a = new A();
		String nameValue=a.getName();
		int idValue=a.getId();
		System.out.println(nameValue);
		System.out.println(idValue);
		
		
		
				
	}
}

class A
{
	private String name="hello";
	private int id =405;
	
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}