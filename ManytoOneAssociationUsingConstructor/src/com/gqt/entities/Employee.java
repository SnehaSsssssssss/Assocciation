package com.gqt.entities;

public class Employee {
       private int empId;
       private String empName;
       private Branch branch;
       
	public Employee(int empId, String empName, Branch branch) {
		
		this.empId = empId;
		this.empName = empName;
		this.branch = branch;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Branch getBranch() {
		return branch;
	}
       
    public void display() {
    	System.out.println("Employee details"+'\n'+empId+" "+empName);
    	System.out.println("Branch Details"+'\n'+branch.getbId()+" "+branch.getbLoc()+'\n'+'\n');
    }
       
}
