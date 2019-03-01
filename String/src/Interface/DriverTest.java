package Interface;

import java.sql.Connection;

public class DriverTest {
	public static void main(String args[]) {
		Database database;
		database = new Database();
		database.myCon();
		database.myUse();
		database.myDisCon();
		
	}
}
