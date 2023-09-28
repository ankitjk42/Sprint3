package com.spring;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Child ob1 = new Child();
        ob1.display();
         Parent p1 = new Child();
         Parent p2 = p1;
        // p1.display();
        ob1.show();
        Parent ob2 = new Parent("Sachin");
        ob1.cal();
         
       
        
        
        
    }
  
}
