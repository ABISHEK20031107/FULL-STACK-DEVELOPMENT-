package com.index;

public class EmployeeCopy {
	int empId;
	String empName;
	
	EmployeeCopy(int id,String name){
		this.empId=id;
		this.empName=name;
	}
	EmployeeCopy(EmployeeCopy copy){
		this.empId=copy.empId;
		this.empName=copy.empName;
	}
	

	public static void main(String[] args) {
		
		EmployeeCopy obj=new EmployeeCopy(111,"abi");
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.empId);



	}

}
