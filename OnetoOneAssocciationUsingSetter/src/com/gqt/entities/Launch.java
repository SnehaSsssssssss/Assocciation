package com.gqt.entities;

public class Launch {
	 public static void main(String[] args) {
		 Employee emp=new Employee();
			emp.setEmpId(123);
			emp.setEmpName("Sneha");
			emp.setEmpAddr("Bangalore");
			
			Account a=new Account();
			a.setAccNo(118);
			a.setAccType("Savings");
			a.setAccName("Sneha");
			
			emp.setAcc(a);
			System.out.println(emp);
  	   
     }
}
