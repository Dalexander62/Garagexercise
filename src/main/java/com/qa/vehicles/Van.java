package com.qa.vehicles;

public class Van extends Vehicle{

	

	private String vanType = "Transit";
	
	public Van(int gears, int topSpeed, String manufacturer, String model, int doors, int id, String vanType) {
		super(gears, topSpeed, manufacturer, model, doors, id, vanType);
		// TODO Auto-generated constructor stub
	}

	
	



	public String getVanType() {
		return vanType;
	}




	public void setVanType(String vanType) {
		this.vanType = vanType;
	}






	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}





	


