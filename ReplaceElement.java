package SaturdayTest;
import java.util.Scanner;
public class ReplaceElement {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
 
		
		        System.out.print("Enter a number: ");
		        String numStr = sc.nextLine();

		        System.out.print("Enter index to replace (0 for first digit): ");
		        int index = sc.nextInt();
		       
		        System.out.print("Enter new digit: ");
		        int newDigit = sc.nextInt();

		        if (index < 0 || index >= numStr.length())
		        {
		        
		        } 
		        else 
		        {
		
		        	String newNumStr = "";
		            for (int i = 0; i < numStr.length(); i++) 
		            {
		                if (i == index) {
		                    newNumStr += newDigit;
		                } 
		                else
		                {
		                    newNumStr += numStr.charAt(i);
		                }
		            }
		            System.out.println("New number: " + newNumStr);
		        }
	    }
		}

	