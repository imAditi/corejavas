package UserInput;

import java.io.IOException;

public class TestDBTool {
	public static void main(String args[]) throws IOException {
		DBTool database = new DBTool();
		database.setServer(args[0]);
		database.setName(args[1]);
		database.setPassword(args[2]);
	
	database.openPrompt();
}
}
