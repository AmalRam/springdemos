package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WelcomeMessageController 
{
	@RequestMapping("/welcomemessage")
	public String welcome()
	{
		return "This is the welcome message -new UST wave 27";
	}
	
	@RequestMapping("/hello/{player}")
	public Player index(@PathVariable String player)
	{
		Player p = new Player(player,"Hello "+player);
		return p;
	}

}
