package programs;

public class StringReverseDemo {
	public static String reversemsg ="";

	public static void main(String[] args) {
	
		message("Hyderbad");
	}
	
	public static void message(String msg)
	{
		for(int i=msg.length()-1; i>=0;i--)
		{
			reversemsg+=msg.charAt(i);
		}
		
		System.out.println(reversemsg);
		
	}
	
}
