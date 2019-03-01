class UrlCommandAssignment {
	
	static String command;
	 
	public static String getCommand(String string) {
      int i = string.lastIndexOf('.');
      int j = string.lastIndexOf('/');
      String command = string.substring(j+1,i);
      return command;
		
	}
}

public class UrlCommandAssignmentTest {
	public static void main(String args[]) {
		UrlCommandAssignment urlCommandAssignment = new UrlCommandAssignment();
		String url = "www.yash.com/admin/policy.html";
		String command = UrlCommandAssignment.getCommand(url);
		System.out.println("Command is:" +command);
	
	}
}