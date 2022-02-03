package com.vehicledekho.data;

public class Bike extends Vehicle {
	
//unique attributes
	private int capacity;
	private boolean discBrake;
	private String customize;

//get set
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean getDiscBrake() {
		return discBrake;
	}
	public void setDiscBrake(boolean discBrake) {
		this.discBrake = discBrake;
	}
	public String getCustomize() {
		return customize;
	}
	public void setCustomize(String customize) {
		this.customize = customize;
	}
	
}
