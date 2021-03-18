package com.stackroute.SpringContextAnnotation.Config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.stackroute.SpringContextAnnotation.Model.Address;
import com.stackroute.SpringContextAnnotation.Model.User;

@Configuration
@ComponentScan("com.stackroute.SpringContextAnnotation.Model")
public class AppConfig 
{
	@Bean("add1")
	@Qualifier("MyList")
    public Address getAddress1()
    {
    	System.out.println("Inside factory method of Address bean...");
    	return new Address(1,"Chicago","USA");
    }
	
	@Bean("add2")
    public Address getAddress2()
    {
    	System.out.println("Inside factory method of Address bean...");
    	return new Address(2,"Delhi","India");
    	
       }
	
	@Bean("user1")
	public User getUser1()
    {
    	System.out.println("Inside factory method of User bean...");
    	return new User(101,"John","john@gmail.com","8737812",new ArrayList(Arrays.asList(getAddress1(), getAddress2())));
    }
}




