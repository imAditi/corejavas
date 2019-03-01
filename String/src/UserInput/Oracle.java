package UserInput;

public class Oracle {

	public Oracle(String name, String password) {
		if(name.equals("scott") && password.equals("tiger")) {
			System.out.println("oracle");
		}
	}

}
