package com.gqt.entities;

public class Employee {
	
	private int empId;
	private String empName;
	private String empAddr;
	private Account acc;
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public void setEmpAddr(String empAddr)
	{
		this.empAddr = empAddr;
	}
	public void setAcc(Account acc)
	{
		this.acc=acc;
	}
	
	public String toString()
	{
		return "Employee details:"+'\n'+
				empId+'\n'+
				empName+'\n'+
				empAddr+'\n'+'\n'+
				"Account Details:"+'\n'+
				acc.getAccNo()+'\n'+
				acc.getAccName()+'\n'+
				acc.getAccType()+'\n';
	}
	
}
	   
	


