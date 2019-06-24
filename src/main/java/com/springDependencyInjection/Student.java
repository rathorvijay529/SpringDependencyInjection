package com.springDependencyInjection;

import java.util.ArrayList;
//DI is methodology which used to inject the dependency at the time of bean initialization by spring.
//IOC works on the principal of DI. All the beans are managed by IOC.

//IOC is the principal in which control of the objects is transfered to the spring.
//Instantiating the objects at the time of loading.
//managing the beans
//configuring the beans dependency

//Types of IOC
// 1. ApplicationContext(Eager Loading, has extra feature including bean factory)
// 2. BeanFactory(Lazy Loading, basic IOC)

//Types of DI
//1.Setter way(<property name="" value=""></property>)
//2.Constructor way(<contructor arg-value=""/>)

public class Student {
	private String name;                                                                    //= "Vijeta"; tightly coupled
	private int rollno;                                                                    //= 129;tightly coupled
	//literal dependency
	
	
	Department dep;                                                               //= new Department();tightly coupled
	//dependency in the  form of objects/reference
	
	ArrayList<Integer> arr;                                                       //= new ArrayList<Integer>();tightly coupled 
	//dependency in the form of collections
	
	public void display()
	{
		System.out.println("Name=="+name);
		System.out.println("Roll no=="+rollno);
		
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}
