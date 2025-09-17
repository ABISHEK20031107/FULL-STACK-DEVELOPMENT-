package Array;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        String str = Integer.toString(num);
		        int length = str.length();

		       
		        int[] digits = new int[length];
		        for (int i = 0; i < length; i++) {
		            digits[i] = str.charAt(i) - '0'; 
		        }

		        System.out.print("Reversed number: ");
		        for (int i = length - 1; i >= 0; i--) {
		            System.out.print(digits[i]);
		        }

		        sc.close();
		    }
	}
