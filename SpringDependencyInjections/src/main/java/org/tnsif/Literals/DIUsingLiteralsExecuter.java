package org.tnsif.Literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecuter {

	public static void main(String[]args) {
		BeanFactory f= new ClassPathXmlApplicationContext("beans.xml");
		SwiftEngine e=f.getBean("Renault",SwiftEngine.class);
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());	
	}
}
