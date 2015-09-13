package com.journeywithjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException{
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("Camel-context.xml");
        Thread.sleep(10000);
    }
}
