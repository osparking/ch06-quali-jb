package ch06.depend;

class Vehicle {
	Driver d = new Driver();
	boolean hasDriver = true;

	public void setHasDriver(boolean hasDriver) {
		this.hasDriver = hasDriver;
	}
}
