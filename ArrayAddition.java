package SpecialClass;

import java.util.*;
            
public class ArrayAddition 
    {

	
public static void main(String[] args)
      {
	        Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int sum = 0;

	        // Input array elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++)
	   {
	            arr[i] = sc.nextInt();
	            sum += arr[i];  // adding directly
	   }

	        // Display sum
	        System.out.println("Sum of array elements = " + sum);

	        
	    }
	}

