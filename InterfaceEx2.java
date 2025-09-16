package com.index;
interface a1{
	public void show();
}
interface b1{
	public void show();
}
class InterSample implements a1,b1{

	public void show() {
		System.out.println("Show from A1");
	}
	public void show1() {
		System.out.println("Show from B1");
		
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {

		InterSample obj=new InterSample();
		obj.show();
		obj.show1();
	}
	
	

}
