package SaturdayTest;
import java.util.*;
public class ReplaceNumberusingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		        // Input number as string
		        System.out.print("Enter a number: ");
		        String numStr = sc.nextLine();

		        // Convert string to char array
		        char[] numArray = numStr.toCharArray();

		        // Input index and new digit
		        System.out.print("Enter index to replace (0 for first digit): ");
		        int index = sc.nextInt();
		       
		        System.out.print("Enter new digit: ");
		        char newDigit = sc.next().charAt(0);

		        // Validate index
		        if (index < 0 || index >= numArray.length)
		        {
		            System.out.println("Invalid index!");
		        }
		        else 
		        {
		            // Replace element at given index
		            numArray[index] = newDigit;

		            // Convert array back to string and print
		            String newNumStr = new String(numArray);
		            System.out.println("New number: " + newNumStr);
		        }
		    }
		}


