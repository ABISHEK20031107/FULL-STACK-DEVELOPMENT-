package com.index;

public class JavaMethodStatic {
    static int count;        
	static void myStaticMethod() {
		
		count++;
		System.out.println("Static Method can be called without object "+count);
	}
	
	public void myPublicMethod() {
		System.out.println("Public Method will be with objects");
	}
	public static void main(String[] args) {
	{
			myStaticMethod();
			JavaMethodStatic obj=new JavaMethodStatic();
			obj.myPublicMethod();
			
			
}
}
}
