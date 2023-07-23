package com.gqt.test;

import com.gqt.entities.Department;
import com.gqt.entities.Employee;

public class Launch {
       public static void main(String[] args) {
    	   Department d = new Department();
    	   d.setDeptId(123);
    	   d.setDeptName("CSE");
    	   d.setDeptLoc("Bangalore");
    	   
    	   
    	   Employee emp1 = new Employee();
    	   emp1.setEmpId(1);
    	   emp1.setEmpName("sneha");
    	   Employee emp2 = new Employee();
    	   emp2.setEmpId(2);
    	   emp2.setEmpName("sowmika");
    	   Employee[] e = new Employee[2];
    	   e[0] = emp1;
    	   e[1] = emp2;
    	   
    	   d.setEmployees(e);
    	   System.out.println(d);
    	   
       }
}
