package SpecialClass;
import java.util.Scanner;
public class NumberOccurence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter how many numbers ;");
		int n=sc.nextInt();
	
		
		System.out.println("Enter the number to count occurance;");
		int n1=sc.nextInt();
		
		int count=0;
		System.out.println("Enter the  number ;");
		for(int i=1;i<=n;i++) {
			int num=sc.nextInt();
			
			if (num==n1) {
				count++;
			}	
		}
		System.out.println(n1+"occurs"+count+"times");
		
		}
	

}
