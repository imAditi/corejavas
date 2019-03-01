package Array;

import java.util.Scanner;

public class LargestElement {
	public static void main(String args[]) {
		int array[] = new int [10];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
		}
		LargestElement largestelement = new LargestElement();
		largestelement.maxInt(array.length, array);
	}
	public void maxInt(int length, int[]arr) {
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("Max value in array:" +max+ "index :"+maxIndex);
	}
}
	 
	 

