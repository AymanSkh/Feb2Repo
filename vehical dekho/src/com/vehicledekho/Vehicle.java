package com.vehicledekho;

public class Vehicle {
	//attributes
	String plate;
	String company;
	int maxSpeed;
	int milage;
	int price;
	int rating;
	String usage;
	
	//methods
	//write data
	public void setVehicleDetails(String plate,String company,int maxSpeed, int milage,int price,String usage,int rating) {
		this.plate = plate;
		this.company = company;
		this.maxSpeed = maxSpeed;
		this.milage = milage;
		this.price = price;
		this.usage = usage;
		this.rating = rating;
	}
	
	//read
	public void showVehicleDetails() {
		System.out.println("Vehicle-Plate "+plate);
		System.out.println("Vehhicle-Company "+company);
		System.out.println("Vehicle-TopSpeed "+maxSpeed);
		System.out.println("Vehical-Milage "+milage);
		System.out.println("Vehical-Price "+price);
		
	}
		
		
	}
	



