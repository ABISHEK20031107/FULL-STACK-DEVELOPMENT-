package Task;

public class StudentT {
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

    public void calculateMarks(int subject1, int subject2) {
        marks = subject1 + subject2;
    }

    public void calculateMarks(int subject1, int subject2, int subject3) {
        marks = subject1 + subject2 + subject3;
    }

    public void calculateMarks(double[] subjects) {
        double total = 0;
        for (double s : subjects) {
            total += s;
        }
        marks = total;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + marks);
    }
    
    public static void main(String[] args) {
    	
    	StudentT s1=new StudentT();
    	
    	s1.setName("Abi");
    	s1.setRollNumber(101);
    	s1.calculateMarks(80,30);
    	s1.displayDetails();
    	
    	StudentT s2=new StudentT();
    	
    	s2.setName("Sibi");
    	s2.setRollNumber(102);
    	s2.calculateMarks(85,65,55);
    	s2.displayDetails();
    	
    	StudentT s3=new StudentT();
    	
    	s3.setName("yuvan");
    	s3.setRollNumber(103);
    	
    	double[]subjects= {8888,9999};
    	
    	s3.calculateMarks(subjects);
    	s3.displayDetails();
        
    }	
    }

