package com.vehicledekho;

public class Main {

	public static void main(String[] args) {
		//create object
//				Vehicle vehicle = new Vehicle();
//				//write
//				vehicle.setVehicleDetails("Mh41DC2983", "Suzuki", 150, 0, 19, 380000);
//				vehicle.showVehicleDetails();
		////bike show case
		Bike bike = new Bike();
		bike.setVehicleDetails("Mh41-78686", "honda", 150, 40, 2000000, "First Hand", 8, "CBR", "Cruiser", 450);
		bike.showVehicleDetails();
		
		//car show case
		Car car = new Car();
		car.setVehicleDetails("Mh31-2983", "Jeep", 250, 30, 2700000, "First-Hand", 7, "Compass", "Dual", 4, true);
		car.showVehicleDetails();
		

	}

}
