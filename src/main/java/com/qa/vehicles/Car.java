package com.qa.vehicles;

public class Car extends Vehicle{

	
	private String colour = "Blue";

	

	

	public Car(int gears, int topSpeed, String manufacturer, String model, int doors, int id, String type,
			String colour) {
		super(gears, topSpeed, manufacturer, model, doors, id, type);
		this.colour = colour;
	}





	public String getColour() {
		return colour;
	}





	public void setColour(String colour) {
		this.colour = colour;
	}





	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	

		
		

}

	
