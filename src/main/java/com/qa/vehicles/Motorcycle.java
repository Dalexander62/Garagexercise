package com.qa.vehicles;

public class Motorcycle extends Vehicle{


	private int horsePower = 220;

	





	

	
	public Motorcycle(int gears, int topSpeed, String manufacturer, String model, int doors, int id, String type,
			int horsePower) {
		super(gears, topSpeed, manufacturer, model, doors, id, type);
		this.horsePower = horsePower;
	}





	public int getHorsePower() {
		return horsePower;
	}





	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}








	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	

		
	}
	
	
	

}

