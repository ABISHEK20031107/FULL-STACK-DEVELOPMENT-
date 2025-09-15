package SpecialClass;
import java.util.*;
public class GreaterOfThree {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First num");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second num");
	    int b=sc.nextInt();
		
	    System.out.println("Enter the Third num");
		int c=sc.nextInt();
		
		if(a>=b &&a >=c) {
			System.out.println("Num A is Greater than B and C");
		}
		else if(c>=a&&c>=b) {
			System.out.println("Num C is Greater than A and c");
		}
		else if(b>=a&b>c){
			System.out.println("Num B is Greater than A and C");
		}
		
	
	}

}
