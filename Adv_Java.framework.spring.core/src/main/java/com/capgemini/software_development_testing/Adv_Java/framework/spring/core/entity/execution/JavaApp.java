package com.capgemini.software_development_testing.Adv_Java.framework.spring.core.entity.execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.software_development_testing.Adv_Java.framework.spring.core.entity.Student;

public class JavaApp {
	public static void execution() {
		String xmlConfigurationFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext= new ClassPathXmlApplicationContext(xmlConfigurationFile);
		Student student = configurableApplicationContext.getBean("student",Student.class);
		System.out.println(student);
		configurableApplicationContext.close();
	}
	
}
