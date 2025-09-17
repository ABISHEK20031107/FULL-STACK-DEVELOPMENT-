package Array;
import java.util.*;
public class CheckEqualNumber {

	public static void main(String[] args) {

  
		Scanner sc = new Scanner(System.in);

		        int[] numbers = new int[2];

		        System.out.print("Enter first number: ");
		        numbers[0] = sc.nextInt();

		        System.out.print("Enter second number: ");
		        numbers[1] = sc.nextInt();

		        
		        if (numbers[0] == numbers[1]) {
		            System.out.println("Both numbers are EQUAL.");
		        } else {
		            System.out.println("Numbers are NOT equal.");
		        }

		        sc.close();
		    }
		}

	