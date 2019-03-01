package com.yash.docapp.main;

import java.util.List;
import java.util.Scanner;

import com.yash.docapp.daoimpl.DocumentDaoImpl;
import com.yash.docapp.domain.Document;
import com.yash.docapp.service.DocumentService;
import com.yash.docapp.serviceimpl.DocumentServiceImpl;
import com.yash.docapp.util.MenuUtil;

public class ApplicationStartup {
	public static void main(String args[]) {
		startUp(new Scanner(System.in));
	}

	private static void startUp(Scanner scanner) {

		DocumentService documentservice = new DocumentServiceImpl(new DocumentDaoImpl());
		Document document = null;
		int choice;
		String conti = null;
		do {

			MenuUtil.printMenu();
			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				createDocument(scanner, documentservice);
				break;
			case 2:
				List<Document> documents = documentservice.listDocument();
				for (Document doc : documents) {
					System.out.println(doc);
				}
				break;	
			case 3:
				System.out.println("------------Search document by title------------");
				String searchTitle = scanner.next();
			    List<Document> docu = documentservice.serachDocument(searchTitle);
				for (Document docs : docu) {
					System.out.println(docs);
				}
				break;
			case 4:
				System.out.println("------------Find document by Id------------");
				int searchId = scanner.nextInt();
				Document document3 = documentservice.findById(searchId);
				System.out.println(document3);
				break;
			case 5:
				System.out.println("------------Delete document------------");
				int documentId = scanner.nextInt();
				documentservice.deleteDocument(documentId);
				break;
			case 6:
				System.out.println("------------Sort document------------");
				List<Document> sortDocument = documentservice.sortDocument();
				for(Document doc: sortDocument) {
					
					System.out.println(doc);
				}
				break;
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

	private static void listDocument(DocumentService documentservice) {
		List<Document> documents = documentservice.listDocument();
		for (Document doc : documents) {
			System.out.println(doc);
		}
	}

	private static void createDocument(Scanner scanner, DocumentService documentservice) {
		Document document;
		document = new Document();
		System.out.println("Enter document id :");
		document.setId(scanner.nextInt());
		System.out.println("Enter title :");
		scanner.nextLine();
		document.setTitle(scanner.nextLine());
		System.out.println("Enter description :");
		document.setDescription(scanner.nextLine());
		documentservice.addDocument(document);
	}

}
