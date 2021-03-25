package programs;

public class Demo2 {
private	int a = 10;
private static	String name = "Ramesh";

public void dispaly() {
	// TODO Auto-generated method stub
	
	System.out.println(a);
	System.out.println(name);
	System.out.println("non- static method calling through object only");

}

public static void hello() {
	// TODO Auto-generated method stub
	
	System.out.println(name);
	//System.out.println(a);
	
	System.out.println("static method");
}

public int getA() {
	return a;
}

public static String getName() {
	return name;
}

}

 class MainClass
{
	public static void main(String[] args) {
		Demo2 d2= new Demo2();
		
		d2.getA();
		
		d2.dispaly();
	// static method calling through class name
		
		Demo2.hello();
		Demo2.getName();
	}
}
