package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
System.out.println("i love code");
System.out.println("it will generate all the java bean class object for ");
Student student=context.getBean("stu",Student.class);
Student student1=context.getBean("stu",Student.class);
if(student.hashCode()==student1.hashCode())
	System.out.println("the bean scope is single ton");
else
	System.out.println("the scope is not singleton");
	}

}
