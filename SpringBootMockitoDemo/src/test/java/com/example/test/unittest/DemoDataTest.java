package com.example.test.unittest;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.unittest.DemoData;

public class DemoDataTest
{
	DemoData dm;
	
	@BeforeEach
	public void init()
	{
		dm = new DemoData();
	}
	//example in Junit
	
	@Test
	public void test01()
	{
		int carcount = dm.getCars().size();
		List<String> data = dm.addCar("Zen");
		assertEquals(carcount+1, data.size());
	}
	
	//example in mockito
	@Test
	public void test02()
	{ 
		DemoData dm1 = Mockito.mock(DemoData.class);
		when(dm1.getCars()).thenReturn(null);
		System.out.println("Mockito object result "+ dm1.getCars());
		
		//real object
		System.out.println("Real object result "+ dm.getCars().get(0));
		
		List<String> dummyCarList = new ArrayList<>();
		dummyCarList.add("Alto");
		when(dm1.getCars()).thenReturn(dummyCarList);
		//mock object
		System.out.println("Mocked objects result for dummy stub "+ dm1.getCars().get(0));
		
		//Spied object
		DemoData dm3 = Mockito.spy(DemoData.class);
		//when(dm3.getCars()).thenReturn(null);
		//System.out.println(dm3.getCars());
		System.out.println(dm3.getCars().get(0));
		
	}

}




