package com.vehicledekho.main;
import com.vehicledekho.data.Bike;
import com.vehicledekho.data.Car;
import com.vehicledekho.ui.VehicleDisplay;

public class Vehiclemain {


	public static void main(String[] args) {
		
		//object bike
		Bike bike = new Bike();
		
		//arguements set
		bike.setBrand("Honda");
		bike.setModel("CBR");
		bike.setMaxSpeed(150);
		bike.setMileage(40);
		bike.setRating(8);
		bike.setUsage("First hand");
		bike.setPrice(1600000);
		bike.setCapacity(2);
		bike.setDiscBrake(true);
		bike.setCustomize("Customised");
		VehicleDisplay.display(bike);
		
		
		//object car
		Car car = new Car();
		
		//arguement set
		car.setBrand("Jeep");
		car.setModel("Compass");
		car.setPrice(2700000);
		car.setMaxSpeed(200);
		car.setMileage(30);
		car.setUsage("First Hand");
		car.setRating(8);
		car.setFourWheelDrive(true);
		car.setPowerSteering(true);
		car.setPowerWindows(true);
		VehicleDisplay.display(car);
	}
		


}
