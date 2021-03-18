package com.example.demo;

public class Player
{
	String name;
	String text;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public Player(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}
	

}
