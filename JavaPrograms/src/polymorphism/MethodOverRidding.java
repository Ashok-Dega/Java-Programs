package polymorphism;

public class MethodOverRidding {
	
	public static void main(String[] args) {
		TestChild2 t2 = new TestChild2();
		t2.m2();
		
	}

}

class TestParent
{
	
	public static void m1()
	{
		System.out.println("Private method");
	}
	
public void m2()
{
	System.out.println("Non abstract method");
}
	
}
abstract class TestChild extends TestParent
{
	/*
	 * public void m1() { System.out.println("Private method is not overridding"); }
	 */
	abstract public void m2();
	
	
	
}
class TestChild2 extends TestParent
{
	
}
