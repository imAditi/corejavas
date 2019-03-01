package ClassObject;

import java.util.Scanner;

 class TollBooth {

		int totalNumberOfCars;
		double totalAmountOfMoney;
	
		TollBooth (int totalNumberOfCars, double totalAmountOfMoney) {
			this.totalNumberOfCars = totalNumberOfCars;
			this.totalAmountOfMoney = totalAmountOfMoney;
		}
		
		void payingCar() {
			
			System.out.println("Paying car");
			totalAmountOfMoney = totalAmountOfMoney + 0.50;	
			totalNumberOfCars = totalNumberOfCars+1;
		}
		
		void noPayCar() {
			System.out.println("Car not paying");
			totalNumberOfCars = totalNumberOfCars+1;
		}
		
		void display() {
			System.out.println("Total number of cars : "+totalNumberOfCars);
			System.out.println("Total amount of money collected : "+totalAmountOfMoney);
			}
		
		void exit() {
			System.out.println("Exit the system");
		}

		
		public static void main(String args[]) {
				TollBooth tollbooth = new TollBooth(0, 0);
				Scanner scanner = new Scanner(System.in);
				char k = 0;
				do {
					System.out.println("press 0 to add the paying car");
					System.out.println("press 1 to add the non paying car");
					System.out.println("press D to display the total number of cars and total amount of money collected");
					System.out.println("press E to exit the system");
					k = scanner.next().charAt(0);
					switch(k)
					{
					case '0' :
						tollbooth.payingCar();
						break;
					case '1' :
						tollbooth.noPayCar();
						break;
					case 'D' :
						tollbooth.display();
						break;
					case 'E' :
						tollbooth.exit();
						break;
					default :
						System.out.println("Input not given");
						break;
					}
				}
				while(k!= 'E');
			}
		
 }

			
