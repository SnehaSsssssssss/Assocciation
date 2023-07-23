package com.gqt.entities;

public class Launch {
       public static void main(String[] args) {
    	   Project p1 =new Project(3,"vendorLink","senthil");
    	   Project p2 =new Project(7,"Maya","Ramana");
    	   Project p3 =new Project(11,"Link","Abishek");
    	   
    	   Employee e1 = new Employee(23,"Nandish",p1,p2);
    	   Employee e2 = new Employee(26,"Shafi",p2,p3);
    	   Employee e3 = new Employee(32,"Sneha",p1,p2,p3);
    	   
    	   e1.display();
    	   e2.display();
    	   e3.display();
    	   
    	   
       }
}
