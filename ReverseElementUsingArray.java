package SaturdayTest;
import java.util.*;
public class ReverseElementUsingArray {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		       
		        System.out.print("Enter a number: ");
		        String input = sc.nextLine();

		        
		        char[] arr = input.toCharArray();

		      
		        System.out.print("Reversed: ");
		        for (int i = arr.length - 1; i >= 0; i--) {
		            System.out.print(arr[i]);
		        }

		        sc.close();
		    }
		}



