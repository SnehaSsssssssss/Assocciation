package com.gqt.entities;

public class Employee {
   private int empId;
   private String empName;
   private String empAddr;
   //Has-a variable
   private Account acc;
   
    public Employee(int empId, String empName, String empAddr, Account acc) {
	
	this.empId = empId;
	this.empName = empName;
	this.empAddr = empAddr;
	this.acc = acc;
}
   public void disp()
   {
	   System.out.println("Employee details");
	   System.out.println(empId);
	   System.out.println(empName);
	   System.out.println(empAddr+'\n');
	   
	   System.out.println("Account Details");
	   System.out.println(acc.getAccNo());
	   System.out.println(acc.getAccType());
	   System.out.println(acc.getAccName());
   }
   
}
