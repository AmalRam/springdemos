package com.stackroute.SpringContextAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.SpringContextAnnotation.Config.AppConfig;
import com.stackroute.SpringContextAnnotation.Model.User;

public class Main 
{
	@Autowired
	private static User usr1;// In the application context of SpringContextAnnotation there will be a single
								// object of User bean;Singleton pattern

	public static void main(String[] args) 
	{
		
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User usr1 = ctx.getBean(User.class);
        System.out.println(usr1);


	}

}
