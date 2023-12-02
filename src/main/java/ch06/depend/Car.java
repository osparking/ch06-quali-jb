package ch06.depend;

class Car {
	private Driver driver;

	Car(Context context) {
		this.driver = context.getDriver();
	}
}
