package com.vehicledekho.data;

public class Car extends Vehicle{

	//unique attributes
	private boolean fourWheelDrive;
	private boolean powerSteering;
	private boolean powerWindows;
	
	//get set
	public boolean getFourWheelDrive() {
		return fourWheelDrive;
	}
	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	public boolean getPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	public boolean getPowerWindows() {
		return powerWindows;
	}
	public void setPowerWindows(boolean powerWindows) {
		this.powerWindows = powerWindows;
	}
	
	

}
