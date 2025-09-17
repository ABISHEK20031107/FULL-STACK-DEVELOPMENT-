package Array;
import java.util.*;
public class ArrayNew {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter "+n+"Element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("The Array Element Are ;");
			System.out.println(arr[i]+"");
		}
		
	}

}
