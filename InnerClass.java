package com.index;

class InClass{
	int x=4;
	
	
}
class OutClass{
	int y=4;
}
public class InnerClass {

	public static void main(String[] args) {

		OutClass obj=new OutClass();
		OutClass.InClass =myOut.new InClass();
	}

}
