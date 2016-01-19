package com.example.project3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.project3.Service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	    	 new ClassPathXmlApplicationContext(new String[] {"Spring-Person.xml"});
    	PersonService personService1 = (PersonService) context.getBean("personService");
    	personService1.sentMessage("message 1");
    	System.out.println(personService1.getMessage());

    	PersonService personService2 = (PersonService) context.getBean("personService");
    	System.out.println(personService2.getMessage());
    }
}
