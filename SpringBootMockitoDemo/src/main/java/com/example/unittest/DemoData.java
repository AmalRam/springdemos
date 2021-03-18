package com.example.unittest;

import java.util.ArrayList;
import java.util.List;

public class DemoData 
{
	List <String> carList = new ArrayList<>();
	
	public DemoData()
	{
		carList.add("Swift");
		carList.add("Ertiga");
	}
	
	public List<String> getCars()
	{
		return carList;
	}
	
	public List<String> addCar(String car)
	{ 
		carList.add(car);
		return carList;
	}
	
	

}
