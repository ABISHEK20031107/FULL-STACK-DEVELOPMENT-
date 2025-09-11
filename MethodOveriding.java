package com.index;
 class Kia{
	 void safety() {
		 System.out.println("Drive Carefully");
	 }
 }
 
class Car extends Kia{
	void safety() {
		System.out.println("Car is safe");
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		Kia k=new Car();
		k.safety();
		

	}
	}
