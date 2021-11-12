package com.qa.main;
 
import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;


public class Runner {

	public static void main(String[] args) {
		
		Car car = new Car(7, 190, "Porsche", "911 Turbo", 3, 1, "Blue", "car");
		
		Van van = new Van(6, 85, "Ford", "Transit", 5, 2, "Cargo van");
		
		Motorcycle bike = new Motorcycle(7, 180, "Triumph", "Bonneville", 0, 3, "Bike", 220);
		
		
		Garage garage = new Garage();

		garage.addVehicle(car);
		garage.addVehicle(bike);
		garage.addVehicle(van);
		
		
//		garage.printVehicle();
		
		
		garage.removeById(3);

		
	}

}
