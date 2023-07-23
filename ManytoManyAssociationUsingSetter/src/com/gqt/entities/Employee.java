package com.gqt.entities;

public class Employee {
	 private int empId;
	    private String empName;
	    private Project[] projects;
		
	    
		
		public void setEmpId(int empId) {
			this.empId = empId;
		}



		public void setEmpName(String empName) {
			this.empName = empName;
		}



		public void setProjects(Project... projects) {
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
