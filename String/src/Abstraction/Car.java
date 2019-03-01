package Abstraction;

public abstract class Car {
	private String registrationNumber;
	public Car(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Car() {
		this("DHO-1111");
		drive();
		fillTank();
		drive();
		stop();
	}
		public void drive () {
		
		}
		public void fillTank() {
			
		}
		public void stop() {
			
		}
		
		}
	


