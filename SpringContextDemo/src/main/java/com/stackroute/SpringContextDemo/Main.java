package com.stackroute.SpringContextDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		
		Address add1 = ctx.getBean("add1", Address.class);
		Address add2 = ctx.getBean("add2", Address.class);
	
		 System.out.println(add1);
		 System.out.println(add2);	
		
		 List<Address> addr = new ArrayList<Address>();
		 addr.add(add1);
		 addr.add(add2);
		 
		User user1 = ctx.getBean("user1",User.class);
		user1.setId(202);
		user1.setName("Penelope");
		user1.setEmail("penelope@gmail.com");
		user1.setPhn("4758234");
		user1.setAddress(addr);
		System.out.println(user1);
		
		UserBO userBO1 = ctx.getBean("userBO1",UserBO.class);
		System.out.println(userBO1);


	}

}
