package com.telusko.SpringWithoutSpringBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
   

	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext( "spring.xml");
    	Dev obj = (Dev)context.getBean("dev");
		obj.build();
//    	
//		obj.age=28;
//		System.out.println(obj.age);
//    	
		//normal way to set
//		obj.setAge(12);
		
		System.out.println(obj.getAge());
    }
}
