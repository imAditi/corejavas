package com.yash.docapp.daoimpl;

import java.util.List;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.domain.Document;
import com.yash.docapp.repository.Repository;

public class DocumentDaoImpl implements DocumentDAO {
	
	private Repository repository = Repository.getRepository();

	@Override
	public void insert(Document document) {
		
		repository.documentlist.add(document);
		System.out.println(document);
	}
	@Override
	public void update(Document document) {
		System.out.println("----------DocumentDAOimpl: update-------------");
		System.out.println(document);
	}
	@Override
	public void delete(int id) {
		System.out.println("----------DocumentDAOimpl: delete-------------");
		System.out.println(id);
	}
	@Override
	public List<Document> list () {
		
		return Repository.documentlist;
	}

}
