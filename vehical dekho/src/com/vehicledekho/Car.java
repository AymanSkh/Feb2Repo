package com.vehicledekho;

public class Car extends Vehicle {
	
	String carName;
	String exhausts;
	int capacity;
	boolean wheelDrive = true;
	
	//write data
	public void setVehicleDetails(String plate,String company,int maxSpeed, int milage,int price,String usage,int rating,String carName,String exhausts,int capacity,boolean wheelDrive) {
		this.plate = plate;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.milage = milage;
		this.price = price;
		this.usage = usage;
		this.rating = rating;
		this.carName = carName;
		this.exhausts = exhausts;
		this.capacity = capacity;
	}
	//read
	public void showVehicleDetails() {
		System.out.println("---------Car Details----------------");
		System.out.println("Plate    --> "+plate);
		System.out.println("Company  --> "+company);
		System.out.println("Name     --> "+carName);
		System.out.println("TopSpeed --> "+maxSpeed+"kmph");
		System.out.println("Milage   --> "+milage);
		System.out.println("Exhausts --> "+exhausts);
		System.out.println("Capacity --> "+capacity);
		System.out.println("Usage    --> "+usage);
		System.out.println("Rating   --> "+rating+"/10");
		System.out.println("Price    --> "+price+" Rs");
		System.out.println("------------------------------------");
		
	}	
	
	}

