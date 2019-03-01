package Array;

public class CarTest {
	public static void main(String args[]) {
		int arr[][] = new int[1][]; 
		arr[0] = new int[] {1,1,0,1,1};
		arr[1] = new int[] {1,1,1,1};
		arr[2] = new int[] {0,0,0};
		arr[3] = new int[] {1,0};
		arr[4] = new int[] {0};
		
		Car car = new Car();
		car.showParking(arr);
		car.carPark(arr);
		car.showParking(arr);
		car.carPark(arr);
		car.carPark(arr);
		car.remove(arr, 0, 4);
		car.carPark(arr);
		car.remove(arr, 1, 3);
		car.showParking(arr);
	}
		
}
