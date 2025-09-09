package com.index;

import java.util.Scanner;

public class Ifexample {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the first number- ");
	    
		
	    int a= sc.nextInt();
	    System.out.print("enter the second number-");
	    
	    int b= sc.nextInt();
	    System.out.print("enter the third number-");
	    
	    int c= sc.nextInt();
	    int total=a+b+c;
	    System.out.println("total ="+total);
	    
	    
	    if(total>100)
	    	System.out.println("the value is greater than 100");
	    
	    else if(total>10)
	    System.out.println("the value is greater than 10");
	    
	    else if(total>20)
		    System.out.println("the value is greater than 20");
	    
	    else if(total>30)
		    System.out.println("the value is greater than 30");
	    
	    else if(total>40)
		    System.out.println("the value is greater than 40");
	    
	    else if(total>50)
		    System.out.println("the value is greater than 50");
	    

	    else if(total>60)
		    System.out.println("the value is greater than 60");
	    
	    //else if
	    
	    
	}

}
