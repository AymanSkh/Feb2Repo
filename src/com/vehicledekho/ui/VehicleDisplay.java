package com.vehicledekho.ui;
import java.util.List;

import com.vehicledekho.data.Bike;
import com.vehicledekho.data.Car;
import com.vehicledekho.data.Vehicle;

public class VehicleDisplay {
	
	public static void display(List<Vehicle> vehicles) {
		for(Vehicle vehicle : vehicles) {
			System.out.println("------------------------");
			System.out.println("Brand-Name :"+ vehicle.getBrand());
			System.out.println("Model-Name :"+ vehicle.getModel());
			System.out.println("Price :" + vehicle.getPrice());
			System.out.println("Max-Speed :"+ vehicle.getMaxSpeed());
			System.out.println("Mileage :"+ vehicle.getMileage());
			System.out.println("Usage :"+ vehicle.getUsage());
			if(vehicle instanceof Bike) {
				Bike bike = (Bike)vehicle;
				System.out.println("Capacity :"+bike.getCapacity());
				System.out.println("Disc-Brake :"+bike.getDiscBrake());
				System.out.println("Stock/Customised :"+bike.getCustomize());
				
				
			} 
			else if (vehicle instanceof Car){
				Car car = (Car)vehicle;
				System.out.println("4Wheel-Drive :"+car.getFourWheelDrive());
				System.out.println("Power-Steering :"+car.getPowerSteering());
				System.out.println("Power-Windows :"+car.getPowerWindows());
			}
			System.out.println("Rating :"+ vehicle.getRating());
				System.out.println("----------------------");
		}
	}
}
				
			
		
	


