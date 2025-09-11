package com.index;

abstract class Shape
{
	int a=2;
	public abstract void rect();
	public void cir() {
		System.out.println("Circle");
	}
}
class Pen extends Shape{
	public void rect() {
		System.out.println("Rectangle"+a);
	}
}
public class Abstract {
	

	public static void main(String[] args) {
		
		Pen obj=new Pen();
		
		Shape obj2=new Pen();
		obj.rect();
		obj2.cir();

	}

}
