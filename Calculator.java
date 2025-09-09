package com.index;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    
	    double num1=sc.nextDouble();
	    
	    System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
   
                    System.out.println("Result = " + result);
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        sc.close();

	    
	    
	    
	}

}
