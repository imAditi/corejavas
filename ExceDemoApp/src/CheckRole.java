
public class CheckRole {

	public static void main(String args[]) {
			System.out.println("----------Line:First-----------");
			String userRole = "admin";
			try {
				authenticationCheck(userRole);
			}
			catch(RuntimeException ex) {
				System.out.println("You are blocked");
				
			System.out.println("------------Line:Last---------------");
			}
	}

	private static void authenticationCheck(String userRole) {
		if(userRole.equals("admin")){
		System.out.println("Welcome admin"); 
		}
		else {
		throw new RuntimeException();
	}
	
}
}
