package com.gqt.entities;

public class Launch {

	public static void main(String[] args) {
		 Project p1 = new Project();
		 p1.setpId(3);;
		 p1.setpName("VendorLink");
		 p1.setpMgr("Senthil");
		 
		 Project p2 = new Project();
		 p2.setpId(7);;
		 p2.setpName("Maya");
		 p2.setpMgr("Ramana");
		 
		 Project p3 = new Project();
		 p3.setpId(11);
		 p3.setpName("Link");
		 p3.setpMgr("Abhishek");
		 
		 
		 Employee e1 = new Employee();
		 e1.setEmpId(23);
		 e1.setEmpName("Nandish");
		 e1.setProjects(p1,p2);
		 
		 Employee e2 = new Employee();
		 e2.setEmpId(26);
		 e2.setEmpName("Shafi");
		 e2.setProjects(p2,p3);
		 
		 Employee e3 = new Employee();
		 e3.setEmpId(32);
		 e3.setEmpName("Sneha");
		 e3.setProjects(p1,p2,p3);
		 
	    e1.display();
	    e2.display();
	    e3.display();

	}

}
