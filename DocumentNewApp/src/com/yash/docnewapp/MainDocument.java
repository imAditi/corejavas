package com.yash.docnewapp;

import java.util.Scanner;

public class MainDocument {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		String conti = null;
		do {
			MyList documentlist = new MyListImpl();
			System.out.println("1. Enter the element");
			System.out.println("2. Display list");
			System.out.println("0. Exit");
			System.out.println("Enter the choice");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				Document document = new Document();
				System.out.println("Enter document id :");
				document.setId(scanner.nextInt());
				System.out.println("Enter title :");
				scanner.nextLine();
				document.setTitle(scanner.nextLine());
				System.out.println("Enter description :");
				document.setDescription(scanner.nextLine());
				documentlist.addDocument(document);

			case 2:
				Document docArray[] = documentlist.list();
				System.out.println("size =" + docArray.length);
				int j = 0, size = 0;
				for (int i = 0; i < docArray.length; i++) {
					if (docArray[i] != null) {
						size++;
					}
				}
				System.out.println("size=" + size);
				for (int i = 0; i < size; i++) {
					System.out.println(docArray[i]);
				}
				break;

			case 0:
				System.out.println("------------Thanks for using system------------");
				System.exit(0);
				break;

			default:
				System.out.println("Galat Jawab");
				break;
			}
			System.out.println("Do you want to continue : [yes/no] : ");

			conti = scanner.next();
		} while (conti.equals("yes"));
	}

}
