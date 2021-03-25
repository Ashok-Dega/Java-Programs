package programs;



public class ArraysDemo {
	
	public static void main(String[] args) {
		
			int [] arr= {5,2,8,7,1};
			int temp=0;
			
			System.out.println(arr.length);
		
			
			
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i+1; j < arr.length; j++) {
					
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						System.out.println(temp);
						arr[i]=arr[j];
						
						System.out.println(arr[i]);
						arr[j]=temp;
					}
					
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"  ");
			}
	}
	
	
	
}	
	
	
