package com.gqt.entities;

public class Employee {
       private int empId;
       private String empName;
       private Branch branch;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

       public void display() {
    	   System.out.println("Employee details"+'\n'+empId+" "+empName);
       	System.out.println("Branch Details"+'\n'+branch.getbId()+" "+branch.getbLoc()+'\n'+'\n');
	}
       
}
