package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	System.out.println(" i love code");
	Cricketer cri=context.getBean("cri",Cricketer.class);
	cri.getScore("Akash");
	
}
}
