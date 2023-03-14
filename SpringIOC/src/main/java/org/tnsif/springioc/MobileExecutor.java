package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hard coding
	/*	Airtel a=new Airtel();
		a.call();
		a.message();
		Jio j=new Jio();
		j.call();
		j.message();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		/*Airtel a=(Airtel)c.getBean("airtel");//id from beans.xml file
		a.call();
		a.message();*/
		
		Jio j=(Jio)c.getBean("jio");//id from beans.xml file
		j.call();
		j.message();
		
		
	}

}
