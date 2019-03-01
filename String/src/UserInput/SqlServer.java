package UserInput;

public class SqlServer {

	public SqlServer(String name, String password) {
		if(name.equals("sa") && password.equals("admin")) {
			System.out.println("sqlserver>");
		}
	}
}

	
