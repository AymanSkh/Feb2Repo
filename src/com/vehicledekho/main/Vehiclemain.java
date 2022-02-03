package com.vehicledekho.main;
import java.util.ArrayList;
import java.util.List;

import com.vehicledekho.data.Bike;
import com.vehicledekho.data.Car;
import com.vehicledekho.ui.VehicleDisplay;
import com.vehicledekho.data.Vehicle;

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
//		VehicleDisplay.display(bike);
		
		
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
//		VehicleDisplay.display(car);
		
//		Vehicle vehicles[]	 = new Vehicle[2];
//		vehicles[0] = bike;
//		vehicles[1] = car;
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(bike);
		list.add(car);
		VehicleDisplay.display(list);
		
	}
		


}
