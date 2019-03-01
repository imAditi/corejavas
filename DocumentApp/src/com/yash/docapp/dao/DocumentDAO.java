package com.yash.docapp.dao;

import java.util.List;

import com.yash.docapp.domain.Document;

public interface DocumentDAO {

	void insert(Document document);
	void update(Document document);
	void delete(int id);
	List<Document> list();
	
}
