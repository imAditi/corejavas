
public class ExcepDemo {

	public static void main(String[] args) {
		System.out.println("--------------Line:First(Main)---------------");
		method1();
		System.out.println("--------------Line:Last(Main)---------------");
	}

	private static void method1() {
		System.out.println("--------------Line:First(Method1)---------------");
		method2();
		System.out.println("--------------Line:Last(Method1)---------------");
	}

	private static void method2() {
		System.out.println("--------------Line:First(Method2)---------------");
		int a = 10;
		int b = 0;
		try {
		int c = a / b;
		System.out.println("Result : " + c);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("--------------Line:Last(Method2)---------------");
	}
}
