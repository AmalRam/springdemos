package com.stackroute.SpringContextDemo;

import java.util.List;

import org.springframework.context.annotation.Bean;

public class User
{
	private int Id;
	private String name;
	private String email;
	private String phn;
	private List<Address> address; //Dependency association;
	
	
	//Address add1 = new Address(1,"chicago","USA");
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public User()
	{}


	public User(int Id, String name, String email, String phn, List<Address> address) {
		super();
		this.Id = Id;
		this.name = name;
		this.email = email;
		this.phn = phn;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", email=" + email + ", phn=" + phn + ", address=" + address + "]";
	}
	
	
	
}