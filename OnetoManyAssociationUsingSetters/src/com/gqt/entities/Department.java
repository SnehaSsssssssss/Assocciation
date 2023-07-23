package com.gqt.entities;

public class Department {
      private int deptId;
      private String deptName;
      private String deptLoc;
      //Has-a variable
      private Employee[] employees;
      
      
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
      
      
	public String toString() {
		String s = "Department Details"+'\n'+deptId+'\n'+deptName+'\n'+deptLoc+'\n'+'\n'+"Employee Details"+'\n';
		for(Employee e:employees) {
			s = s + e.getEmpId()+'\n';
			s = s + e.getEmpName()+'\n';
			
		}
		return s;
	}
}
