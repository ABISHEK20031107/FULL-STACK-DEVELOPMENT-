
package com.index;

 
public class Java2 {

	public Java2() {
		
	}
		
	public static void main(String[] args) {
		
		int a=13;
		int b=4;
		int c=a%b;
		int d=a/b;
		int e=a+b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
        System.out.println(++a);
        
        System.out.println(b--);
		
	   System.out.println(a+=3);
	   
	   System.out.println(a*=3);
	   
	   System.out.println(--b);
	   
	   System.out.println(a++);
	   
	   
	   //comparison  operators;
	   int f=30,g=40,h=70;
	   System.out.println((f>g));
	   System.out.println((f<g));
	   System.out.println((f>=g));
	   System.out.println((f<=g));
	   System.out.println((g<=f));
	   System.out.println((g>f));
	   System.out.println((g<f));
	   System.out.println((g>=f));
	   System.out.println((f!=g));
	   
	   
	   //logical operators;
	   boolean x=true;
	   boolean y=false;
	   System.out.println((x && y));
	   
	   System.out.println((x||y));
	   
	   System.out.println((!x));
	   
	   
	   
	   boolean l=true;
	   boolean k=true;
	   System.out.println((l && k));
	   
	   System.out.println((l||k));
	   
	   System.out.println((!l));
	   
	   
	   
	   
	}

}
