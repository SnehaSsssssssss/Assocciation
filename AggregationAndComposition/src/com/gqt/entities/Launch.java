package com.gqt.entities;

public class Launch {
    public static void main(String[] args) {
    	 Charger ch = new Charger("samsung",22.5f);
    	 
    	 Mobile m = new Mobile();
    	 m.setCharge(ch);
    	 System.out.println(m.os.getName());
    	 System.out.println(m.os.getSize());
    	 System.out.println(m.charge.getBrand());
    	 System.out.println(m.charge.getVoltage());
    	 
    	 m= null;
    	 
    	 System.out.println(ch.getBrand());
    	 System.out.println(ch.getVoltage());
    	
    	
    	 
    	 
    }
}
