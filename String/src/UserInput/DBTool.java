package UserInput;

public class DBTool {
	private String server;
	private String name;
	private String password;
	
	public void setServer(String server) {
		this.server = server;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void openPrompt() {
		if(server.equalsIgnoreCase("MySql")) {
		MySql mysql = new MySql(this.name, this.password);	
		}
		else if(server.equalsIgnoreCase("Oracle")) {
			Oracle orcle = new Oracle(this.name, this.password);
		}
		else if(server.equalsIgnoreCase("SqlServer")) {
			SqlServer sqlserver = new SqlServer(this.name, this.password);
		}
		else {
			System.out.println("Server doesnot exist!");
		}
		
	}
	
	
}
