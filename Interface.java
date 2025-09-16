package SpecialClass;
interface shape{  //interface interfacename
	double getArea(); 
}
class Rectangle implements shape{
	private double length;
	private double width;
	public Rectangle(double length,double width) {//p constructor
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		return length*width;
	}
}

class Triangle implements shape{
	private double base;
	private double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
}
class Circle implements shape{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class Interface {

	public static void main(String[] args) {
		
		//with creating obj using class wih interface
		//interfacename obj=new classname():
		//interfaceneme oobj=new class(paremeters)
		shape rectangle =new Rectangle(5,6);
		shape triangle=new Triangle(3,5);
		shape circle=new Circle(5);
		System.out.println("area of the rectangle:"+rectangle.getArea());
		System.out.println("area of the Triangle:"+triangle.getArea());
		System.out.println("area of the circle:"+circle.getArea());
		
	

	}

}