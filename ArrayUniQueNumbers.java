package SpecialClass;
import java.util.*;
   public class ArrayUniQueNumbers 
{

public static void main(String[] args) {
	           Scanner sc = new Scanner(System.in);

	           // Input array size
	           System.out.print("Enter the number of elements: ");
	           int n = sc.nextInt();

	           int[] arr = new int[n];
	           int[] lengths = new int[n];

	           // Input numbers
	           System.out.println("Enter " + n + " numbers:");
	           for (int i = 0; i < n; i++) {
	               arr[i] = sc.nextInt();
	               lengths[i] = String.valueOf(Math.abs(arr[i])).length(); // digit length
	           }

	           // Check if all lengths are equal
	           boolean allEqual = true;
	           for (int i = 1; i < n; i++) {
	               if (lengths[i] != lengths[0]) {
	                   allEqual = false;
	                   break;
	               }
	           }

	           // Check if all lengths are unique
	           boolean allNotequal = true;
	           for (int i = 0; i < n; i++) {
	               for (int j = i + 1; j < n; j++) {
	                   if (lengths[i] == lengths[j]) {
	                       allNotequal = false;
	                       break;
	                   }
	               }

	              
	           
	           }
	          
	           // Output
	           if (allEqual)
	      {
	               System.out.println("All numbers have equal digit length.");
	       }
	           else if (allNotequal)
	       {
	               System.out.println("All numbers have not equal digit lengths.");
	           } 
	           else 
	       {
	               System.out.println("Numbers have mixed digit lengths (neither all equal nor all NotEqual).");
	           }

	          }
	   }


