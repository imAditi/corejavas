package com.yash.docapp.service;

import java.util.List;

import com.yash.docapp.domain.Document;

public interface DocumentService {

	void addDocument(Document document);
	void updateDocument(Document document);
	void deleteDocument(int id);
	List<Document> listDocument();
	List<Document> sortDocument();
	List<Document> serachDocument(String searchTitle);
	Document findById(int id);
	List<Document> duplicateList();
}
