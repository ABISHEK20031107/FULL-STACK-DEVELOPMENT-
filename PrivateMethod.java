package com.index;

	class Myclass
	{
		public void display() 
		{
			System.out.println("Hello");
		}
		public void callDisplay() 
		{
			display();
		
	}
	}
	
	public class PrivateMethod {		
	public static void main(String[] args) {
		Myclass obj=new Myclass();
	   obj.callDisplay();
	}

	}


