package ch06.depend;

public class Reservation {
	DBManager manager;
	
	public Reservation(DBManager manager) {
		this.manager = manager;
	}

	public void makeReservation() {
		manager.initDatabase();
	}
}

