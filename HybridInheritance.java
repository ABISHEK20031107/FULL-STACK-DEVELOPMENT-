package com.index;
class HumanBody{
	public void displayHuman() {
		System.out.println("About Human body");
	}
}
interface male{
	public void show1();
}
interface female{
	public void show1();
}
public class HybridInheritance extends  HumanBody implements male,female

{public void show1() {
	
	System.out.println("Implement of show method in both male and female");
}public void displayHybrid() {
	System.out.println("method About Hybrid inheritance");
}


	public static void main(String[] args) {

		HybridInheritance obj=new HybridInheritance();
		System.out.println("Implement of hybrid inheritance in java");
		obj.show1();
		obj.displayHybrid();
	}
}
