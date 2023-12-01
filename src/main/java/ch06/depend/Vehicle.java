package ch06.depend;

class Vehicle {
	Driver d;
	boolean hasDriver = true;
	
	Vehicle(Driver d) {
		this.d = d;
	}

	public void setHasDriver(boolean hasDriver) {
		this.hasDriver = hasDriver;
	}
}
