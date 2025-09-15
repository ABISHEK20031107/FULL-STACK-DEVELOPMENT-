package SpecialClass;
import java.util.*;
public class GreaterOfTwo {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("Number A is Greater");
			
		}
		else if(b>a) {
			System.out.println("Number B is Greater");
		}
		else if(a==b){
			System.out.println("Numbers Are Equal ");
			
		}
	}

}
