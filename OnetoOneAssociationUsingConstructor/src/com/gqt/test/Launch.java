package com.gqt.test;
import com.gqt.entities.*;
public class Launch {
       public static void main(String[] args) {
    	   Account a = new Account(1212,"savings","sneha");
    	   Employee e = new Employee(123,"sneha","Bangalore",a);
    	   e.disp();
    	   
       }
}
