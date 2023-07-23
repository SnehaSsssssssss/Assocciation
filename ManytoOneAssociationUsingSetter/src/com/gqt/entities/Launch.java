package com.gqt.entities;

public class Launch {

	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setbId(6);
        branch.setbLoc("coxtown");
        
        Employee employee1 = new Employee();
        employee1.setEmpId(23);
        employee1.setEmpName("Nandish");
        employee1.setBranch(branch);
        
        Employee employee2 = new Employee();
        employee2.setEmpId(26);
        employee2.setEmpName("Shafi");
        employee2.setBranch(branch);
        
        Employee employee3 = new Employee();
        employee3.setEmpId(32);
        employee3.setEmpName("Sneha");
        employee3.setBranch(branch);
        
        employee1.display();
        employee2.display();
        employee3.display();
        }

}
