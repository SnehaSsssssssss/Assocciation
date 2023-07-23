package com.gqt.entities;

public class Department {
    private int deptId;
    private String deptName;
    private String deptLoc;
    
    //Has-a variable
    private Employee[] emp;

	public Department(int deptId, String deptName, String deptLoc, Employee[] emp) {
		
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.emp = emp;
	}
    
	public void disp() {
		System.out.println("Department Details");
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(deptLoc);
		System.out.println();
		System.out.println("Employee Details");
		for(Employee employee:emp) {
			System.out.print(employee.getEmpId()+" ");
			System.out.println(employee.getEmpName());
		}
	}
    
}
