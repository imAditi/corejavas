package Abstraction;

public class Maruti800 extends Car {
	
	public Maruti800(String registrationNumber) {
		super(registrationNumber);
	}
	
	public void drive(String getRegistrationNumber) {
		System.out.println("Drive maruti with normal steering reg no" +getRegistrationNumber);
	}
	public void fillTank(String getRegistrationNumber) {
		System.out.println("Fueling the tank reg no" +getRegistrationNumber);
	}
	public void stop(String getRegistrationNumber) {
		System.out.println("Stop maruti using normal break reg no"+getRegistrationNumber);
	
	}
}
