package UserInput;

public class MySql extends DBTool{

	public MySql(String name, String password) {
		if(name.equals("root") && password.equals("admin")) {
			System.out.println("mysql>");
		}
	}

}
