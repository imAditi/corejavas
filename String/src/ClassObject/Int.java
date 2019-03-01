package ClassObject;

 class IntTest {

		public int variable;
		
		public IntTest() {
		  this.variable=0;
		}
		
		public void setVariable(int variable) {
			this.variable=variable;
		}
		
		public int add(IntTest variable1,IntTest variable2) {
			return (this.variable=variable1.variable+variable2.variable);
		}
	}

public class Int {

	public static void main(String[] args) {
		
		IntTest variable=new IntTest();
		
		IntTest variable1=new IntTest();
		variable1.setVariable(23);
		
		IntTest variable2=new IntTest();
		variable2.setVariable(30);
		System.out.println(variable.add(variable1,variable2));

	}

}



