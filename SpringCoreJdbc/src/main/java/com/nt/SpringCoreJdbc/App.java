package com.nt.SpringCoreJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.entity.StudentBo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfg/context.xml");
        System.out.println("i love code");
        JdbcTemplate template=(JdbcTemplate) context.getBean("hi");
    }
}
