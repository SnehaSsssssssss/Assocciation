package com.gqt.entities;

public class Launch {
	 public static void main(String[] args) {
		   Employee emp1 = new Employee(1,"sneha");
		   Employee emp2 = new Employee(2,"sowmika");
		   
		   Employee[] e = new Employee[2];
		   e[0] = emp1;
		   e[1] = emp2;
		   
		   Department dept = new Department(123,"CSE","Bangalore",e);
		   dept.disp();
	   }
}
