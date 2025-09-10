package Task;
class Student
	{
   
    private String name;
    private int rollNumber;
    private double marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
}
    public class Main{
    	public  static void main(String[] args) {
    		
    		Student s1=new Student();
    		
    	     s1.setName("Abishek");
    		 s1.setRollNumber(301);
    		 s1.setMarks(99);
    		 
    		 System.out.println("Name:"+s1.getName());
    		 System.out.println("RollNumber:"+s1.getRollNumber());
    		 System.out.println("Marks:"+s1.getMarks());
    		 
    	 
    	}
    }