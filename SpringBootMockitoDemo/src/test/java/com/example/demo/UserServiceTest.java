package com.example.demo;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class UserServiceTest 
{
	
	@Mock
	private UserRepository userRepository;// DAO Repo layer
	
	@InjectMocks
	private UserService userService; //Injecting mock objects into UserService real object // Impl
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@BeforeEach
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		mockMvc= MockMvcBuilders.standaloneSetup(userService).build();
	}
	
	
	@Test
	public void getAllUser()
	{
		List<User> li = new ArrayList();
		
		User user = Mockito.mock(User.class);
		user.setId("101");
		user.setName("John");
		li.add(user);
		
	
	when(userRepository.findAll()).thenReturn(li);
	List<User> uList = userService.getAllUser();
	assertEquals(li,uList);
	
	
	
	}
}
