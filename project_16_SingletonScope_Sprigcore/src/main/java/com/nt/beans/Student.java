package com.nt.beans;

import java.util.Date;

public class Student {
private Date date;
//it is mendotory to create a constructor
public Student(Date date)
{
	System.out.println("this is 0 param constructor");
}
public String wishmwssageGenerator(String name)
{
	int hour=date.getHours();
	System.out.println(hour);
	if(hour>8)
		return "Goodmorning"+name;
	else if(hour>12)
		return "goodnoon"+name;
	else if(hour>16)
		return "GoodEvening"+name;
	else
		return "Goodnight"+name;
	
}
}
