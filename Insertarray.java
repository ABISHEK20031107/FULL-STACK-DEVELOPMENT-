package Array;

import java.util.Scanner;

public class Insertarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos,x;
		//no of elements for array
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements you want in arra:");
		n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter all the elements");
		
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the position where you want to insert elements:");
		pos=s.nextInt();
		
		System.out.println("Enter the element you want to insert:");
		x=s.nextInt();
		
		for(int i=(n-1);i>=(pos-1);i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;// in that position x value will be replaced
		System.out.println("After inserting;");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"'");
		}
	}

}