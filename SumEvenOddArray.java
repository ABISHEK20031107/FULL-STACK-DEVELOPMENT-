package SaturdayTest;
import java.util.*;


	public class SumEvenOddArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) 
	     {
	            arr[i] = sc.nextInt();
	     }

	        int sumEven = 0;
	        int sumOdd = 0;

	        // Calculate sum of even and odd numbers
	        for (int i = 0; i < n; i++)
	    {
	            if (arr[i] % 2 == 0)
	      {
	                sumEven += arr[i];
	        } 
	            else
	   {
	                sumOdd += arr[i];
	        }
	        }

	        // Print results
	        System.out.println("Sum of even numbers: " + sumEven);
	        System.out.println("Sum of odd numbers: " + sumOdd);
	    }
	}
