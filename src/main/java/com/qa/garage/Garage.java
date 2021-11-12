package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Vehicle;

public class Garage {

	List<Vehicle> vehicleList = new ArrayList<Vehicle>();



	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {

		if (this.vehicleList.remove(vehicle)) {
			System.out.println("This vehicle has been removed");
		} else {
			System.out.println("Vehicle not found");
		}

	}

	public void removeById(int id) {
		Vehicle vehicleFound = null;
		for (Vehicle v : vehicleList) {
			if (v.getId()== id) {
				vehicleFound = v;
				
			}
		}
		
		removeVehicle (vehicleFound); 
		
	}
		
	public void removeVehiclesByType(String type) {
		
		
		
		
//	public void printVehicle(){
//			for (Vehicle vehicle : this.vehicleList);
//			
//			
//		}
//
//	public static void fix(Vehicle vehicle) {
//		vehicle.calculateBill();
	

	}

	
		
	}


