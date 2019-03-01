package com.yash.docnewapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DocumentArrayArr {
	
	public static void main(String args[]) {

	int [] arr = new int[10];
	int choice;
	String conti = null;
	int size = 10;
	int index = -1;
	int counter = 0;
	
	do {
		ArrayMenuUtil.printMenu();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1 : 
			 index++;
			 counter++;
			 if(counter>arr.length) {
				
				arr = Arrays.copyOf(arr, size+1);
				size++;
			 }
			 System.out.println("Enter elements in the array");
			 arr[index] = scanner.nextInt();
		       break;
			
			case 2 : 
			System.out.println("Display elements in array");
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		case 0:
			System.out.println("------------Thanks for using system------------");
			System.exit(0);
		default:
			System.out.println("...........Galat Jawab..........");
			break;
		}
			System.out.println("Do you want to continue : [yes/no] : ");

			conti = scanner.next();
	} while (conti.equals("yes"));
	}
	}
