package com.yash.docapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.yash.docapp.domain.Document;

public class Repository {
	private static Repository repository;

	public static List<Document> documentlist = new ArrayList();
	
	public Repository() {
		documentlist.add(new Document(101,"java basics","java core basics"));
		documentlist.add(new Document(102,"java advance","java advance basics"));
	}
	

	public static Repository getRepository() {

if(repository == null) {
	repository = new Repository();

}
		return repository;
	}

	
}
