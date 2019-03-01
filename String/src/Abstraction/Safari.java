package Abstraction;

public class Safari extends Car{
	public Safari(String registrationNumber) {
		super(registrationNumber);
	}
		public void drive(String getRegistrationNumber) {
			System.out.println("Drive safari with power steering reg no" +getRegistrationNumber);
		}
		public void fillTank(String getRegistrationNumber) {
			System.out.println("Fueling the tank reg no" +getRegistrationNumber);
		}
		public void  stop(String getRegistrationNumber) {
			System.out.println("Stop safari using power break reg no" +getRegistrationNumber);
		}
	}


