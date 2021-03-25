package programs;

public class Demo {
private   int a = 90;
private String name ="Ramesh Soft";

public void m1() {
	// TODO Auto-generated method stub
	
	System.out.println("RameshSoft");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	System.out.println(name);
	System.out.println(a);
}

public static void m2() {
	// TODO Auto-generated method stub
	System.out.println("static method");
	//System.out.println(name);  
	
}

public  int m3()
{
	
	return a;
	
}

public static void main(String[] args) {
	
	String a = "chennai";
	
	System.out.println(a);
	
	Demo d =new Demo();
	System.out.println(a);
	int b =d.a;
	System.out.println(d.a);
	System.out.println(b);
	
	int value= d.m3();
	
	System.out.println(value);

}
}
