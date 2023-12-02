package ch06.depend;

public class Reservation {
	
	public void makeReservation() {
		DBManager.manager.initDatabase();
	}
}
