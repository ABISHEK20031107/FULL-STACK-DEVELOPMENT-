package Task;
import java.util.Scanner;
public class CharacterPattern {


	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter rows: ");
	        int n = sc.nextInt();

	        // Pattern 1
	        System.out.println("Pattern 1:");
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }


	    }
	}

