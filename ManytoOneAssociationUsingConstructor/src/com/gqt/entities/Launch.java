package com.gqt.entities;

public class Launch {
	
	public static void main(String[] args) {
		Branch branch = new Branch(6,"coxtown");
	    
	    Employee employee1 = new Employee(23,"Nandish",branch);
	    Employee employee2 = new Employee(26,"shafi",branch);
	    Employee employee3 = new Employee(32,"Sneha",branch);
	    
	    employee1.display();
	    employee2.display();
	    employee3.display();
	}
}
