package com.example.demo;

public class currentobservation {
	private String id;
	private String name;
	private String Temp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemp() {
		return Temp;
	}
	public void setTemp(String temp) {
		Temp = temp;
	}
	
	public currentobservation(String id, String name, String Temp) {
		this.id = id;
		this.name = name;
		this.Temp = Temp;
	}
	
	public currentobservation() {
		
	}
	
}
