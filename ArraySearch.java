package Array;
import java.util.*;
public class ArraySearch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element :");
		
		int n=sc.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter the:"+n+"Element.");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("Enter the element you want to Search:");
		
		int key=sc.nextInt();
		
		boolean found=false;
		
		for(int i =0;i<n;i++) 
		{
			if(arr [i]==key)
			{
				
				System.out.println("The element is found.");
				found=true;
			}
			
			if(!found)
			{
				System.out.println("The Element not found.");
			}
		}
	}

}

