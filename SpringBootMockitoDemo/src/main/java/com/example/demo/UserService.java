package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user)
	{
		User u = userRepository.save(user);
		if(u!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	
	public List<User> getAllUser()
	{
		List<User> userList = (List<User>)userRepository.findAll();// returning some real data
		return userList;
	}
	

}
