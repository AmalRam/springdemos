package com.stackroute.SpringContextDemo;

public class Address
{
	private int id;
	private String city;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
	public Address(int id, String city, String country) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
	}
	
	public void setUP() {
		System.out.println("Inside setUP().....init() triggered");
	}
	
	
	public void cleanUP() {
		System.out.println("Inside cleanUP().....destroy() triggered");
	}
	
	
	

}
