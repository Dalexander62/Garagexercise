package com.qa.vehicles;

public abstract class Vehicle {

	private int id;
	private int gears;
	private int topSpeed;
	private String manufacturer;
	private String model;
	private int doors;
	private String type;
	
	
	


	public Vehicle(int gears, int topSpeed, String manufacturer, String model, int doors, int id, String type) {
		super();
		this.gears = gears;
		this.topSpeed = topSpeed;
		this.manufacturer = manufacturer;
		this.model = model;
		this.doors = doors;
		this.id = id;
		this.type = type;
		
		
	}


	public abstract double calculateBill();
	
	
	
	
	

	public int getGears() {
		return gears;
	}



	public void setGears(int gears) {
		this.gears = gears;
	}



	public int getTopSpeed() {
		return topSpeed;
	}



	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	


	@Override
	public String toString() {
		return "Vehicle [gears=" + gears + ", topSpeed=" + topSpeed + ", manufacturer=" + manufacturer + ", model="
				+ model + ", doors=" + doors + ", id=" + id + "]";
	}
	
	
	
	
}
