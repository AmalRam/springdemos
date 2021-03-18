package com.stackroute.SpringContextDemo;

import java.util.List;
import java.util.Map;

public class UserBO 
{
	
	private  Map<User, List<Address>> userAddressMap;
	
	
	public Map<User, List<Address>> getUserAddressMap()
	{
		return userAddressMap;
	}
	
	public void setUserAddressMap(Map<User, List<Address>> userAddressMap)
	{
		this.userAddressMap = userAddressMap;
	}
	public UserBO(Map<User, List<Address>> userAddressMap)
	{
	   super();
	   this.userAddressMap = userAddressMap;
	}

	
	  @Override
	  public String toString() 
	  { 
		  return "UserBO is -->  " + userAddressMap ;
	  }
	 
}






