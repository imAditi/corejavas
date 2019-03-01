package Array;

import java.util.Scanner;

public class TransposeArray {
	
	public static void transpose(int arr[][]) {
		int  length = 0;
		int transpose[][] = new int[4][4];
	    for (int i = 0; i < length; i++)
	        for (int j = 0; j < length; j++)
	            transpose[j][i] = arr[j][i];
	    
	    for (int i = 0; i < arr.length; i++)
	    {
	        for (int j = 0; j < arr.length; j++)
	           System.out.print(transpose[i][j]);
	      
	    }
	}
	 
	public static void main(String args[]) {
	{Scanner scanner = new Scanner(System.in);
		int length;
		int arr[][] = new int[4][4];
	  /*  int arr[][] = { {1, 1, 1, 1},
	                    {2, 2, 2, 2},
	                    {3, 3, 3, 3},
	                    {4, 4, 4, 4}};*/
	 for(int i=0;i<4;i++) {
		 for(int j=0;j<4;j++) {
			 arr[i][j] = scanner.nextInt();
		 }
	 }
	   TransposeArray transposearray = new TransposeArray();
	 
	   transposearray.transpose(arr);
	 
	    System.out.println("Result matrix is: ");
	    for (int i = 0; i < arr.length; i++)
	    {
	        for (int j = 0; j < arr.length; j++)
	           System.out.print(arr[i][j]);
	        System.out.println("\n");
	    }
	}
}
}