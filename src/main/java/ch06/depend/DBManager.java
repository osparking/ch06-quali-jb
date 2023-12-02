package ch06.depend;

public class DBManager {
	public static DBManager manager;

	public static void initialize() {
		manager = new DBManager();
	}

	public void initDatabase() {
	}
}
