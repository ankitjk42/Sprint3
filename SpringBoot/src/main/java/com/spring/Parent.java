package com.spring;

public class Parent {
	
	protected String name = "Ankit"; //instaces variable
	
	 void show () {
		 
		
		System.out.println(name);
		
	}
	   Parent(String name) {
		  this.name= name;
		  
	  }
	   void cal() {
		   
		   System.out.println("This is to use claculation.");
	   }
	   Parent (int i){
		   i=10;
		   
	   }

}
