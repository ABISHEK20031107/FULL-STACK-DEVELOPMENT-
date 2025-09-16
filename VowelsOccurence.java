package SpecialClass;
import java.util.Scanner;
public class VowelsOccurence {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a word: ");
	        String num = sc.nextLine();  

	        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

	        for (int i = 0; i <num .length(); i++) {
	            char ch =num.charAt(i);
	            switch (ch) {
	                case 'a': aCount++; break;
	                case 'e': eCount++; break;
	                case 'i': iCount++; break;
	                case 'o': oCount++; break;
	                case 'u': uCount++; break;
	            }
	        }

	        System.out.println("Occurrences of vowels:");
	        System.out.println("a = " + aCount);
	        System.out.println("e = " + eCount);
	        System.out.println("i = " + iCount);
	        System.out.println("o = " + oCount);
	        System.out.println("u = " + uCount);
	}

}
