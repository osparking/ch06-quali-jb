package ch06.depend;

public class WorkMeeting {
	
	public void makeReservation() {
		DBManager manager = new DBManager();
		manager.initDatabase();
		Reservation reservation = new Reservation(DBManager.manager);
		reservation.makeReservation();
	}
	
}
