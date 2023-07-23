package com.gqt.entities;

public class Employee {
    private int empId;
    private String empName;
    private Project[] projects;
	public Employee(int empId, String empName, Project... projects) {
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}
	
	public void display(){
		System.out.println("Employee Details"+'\n'+empId+" "+empName+'\n'+"Project Details");
		for(Project prj:projects) {
			System.out.println(prj.getpId()+" "
			+prj.getpName()+" "
			+prj.getpMgr());
			
			}
		System.out.println();
	}
    
	
    
}
