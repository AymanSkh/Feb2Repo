package com.vehicledekho;

public class Bike extends Vehicle {
	//attributes
	String bikeName;
	String bikeClass;
	int engine;
	
	//write data
	public void setVehicleDetails(String plate,String company,int maxSpeed, int milage,int price,String usage,int rating,String bikeName,String bikeClass,int engine) {
		this.plate = plate;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.milage = milage;
		this.price = price;
		this.usage = usage;
		this.rating = rating;
		this.bikeClass = bikeClass;
		this.bikeName = bikeName;
		this.engine = engine;
	}
	//read
	public void showVehicleDetails() {
		System.out.println("---------Bike Details----------------");
		System.out.println("Plate    --> "+plate);
		System.out.println("Company  --> "+company);
		System.out.println("Name     --> "+bikeName);
		System.out.println("TopSpeed --> "+maxSpeed+"kmph");
		System.out.println("Milage   --> "+milage);
		System.out.println("Class    --> "+bikeClass);
		System.out.println("Engine   --> "+engine+"cc");
		System.out.println("Usage    --> "+usage);
		System.out.println("Rating   --> "+rating+"/10");
		System.out.println("Price    --> "+price+" Rs");
		System.out.println("------------------------------------");
		
	}	
	
	}


