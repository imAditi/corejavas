package Array;

public class Car {
	public void carPark(int array[][]) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == 0) {
					array[i][j] = 1;
					break;
				}
			}
	}
}
	void remove(int array[][], int index1, int index2) {
		array[index1][index2] = 0;
	}
void showParking(int array[][]) {
	for(int i = 0;i < array.length; i++) {
		for(int j = 0; j< array[i].length; j++) {
			System.out.print("   "+array[i][j]+"   ");
		}
	}
	System.out.println();
}
}