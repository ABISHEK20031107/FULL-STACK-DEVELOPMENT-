package SaturdayTest;
import java.util.*;
public class ReverseElementUsingArray {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		        // Take input
		        System.out.print("Enter a number: ");
		        String input = sc.nextLine();

		        // Convert input string to array of characters
		        char[] arr = input.toCharArray();

		        // Print array in reverse order
		        System.out.print("Reversed: ");
		        for (int i = arr.length - 1; i >= 0; i--) {
		            System.out.print(arr[i]);
		        }

		        sc.close();
		    }
		}


