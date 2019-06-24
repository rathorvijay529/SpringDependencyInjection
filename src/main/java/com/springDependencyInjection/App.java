package com.springDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Student student = new Student();
//    	student.name = "vijeta";
//    	student.rollno = 129;
//    	student.display();
    	//Reason = It is violating datahiding concept in oops.
    	
    	
//    	Student  student = new Student();
//    	student.setName("vijeta");
//    	student.setRollno(129);
//    	student.display();
    	//Case2 = we are injecting dependency manually, not using IOC
    	
   //Case 3 
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
    	Student student = applicationContext.getBean("student" ,Student.class);//getBean() returns objects so we have to typecast to desired formate
    	student.display();
    	
    }
}
