package programs;

public class Demo3 {
	
	int k=10;
	static String name = "Ramesh";
	static Demo3 d3 = new Demo3();
	public static void main(String[] args) {
	Demo3 d4 = new Demo3();
	System.out.println(d4.k);
		System.out.println(d3.k);
		System.out.println(Demo3.name);
					
	}

}

class TestTwo
{
	private	int a =90;
	private	static String name = "Ramesh";
	
	TestTwo testTwo = new TestTwo();// non static object type reference variable
	//static TestTwo t2 = new TestTwo(); // static object type
	//new TestTwo(); CE
	

public  void hello() {
	new TestTwo();
	
	System.out.println(a);
	System.out.println(name);

}

 static public void dispaly() {
	// TODO Auto-generated method stubt
	 
	final TestTwo t1 = new TestTwo();// local object type variable
	
	
	 
	 System.out.println(t1.a);
	 
	 System.out.println(t1.a=100);
	 System.out.println(name);
	 t1.hello();

}


}
