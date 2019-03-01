package com.yash.docapp.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.domain.Document;
import com.yash.docapp.repository.Repository;
import com.yash.docapp.service.DocumentService;

public class DocumentServiceImpl implements DocumentService {

	private DocumentDAO documentdao;

	public DocumentServiceImpl(DocumentDAO documentdao) {
		this.documentdao = documentdao;
	}

	@Override
	public void addDocument(Document document) {
		documentdao.insert(document);

	}

	@Override
	public void updateDocument(Document document) {
		documentdao.update(document);

	}

	@Override
	public void deleteDocument(int id) {
		documentdao.delete(id);

	}

	@Override
	public List<Document> listDocument() {

		List<Document> documentList = documentdao.list();

		if (documentList.size() == 0) {
			System.out.println("Warning : no data available !");
		}
		return documentList;
	}

	@Override
	public List<Document> sortDocument() {
		List<Document> documents = documentdao.list();
		List<Document> filterlist = new ArrayList();
		Collections.sort(documents, new Sorting());
		for (Document doc : documents) {

			filterlist.add(doc);
		}
		return filterlist;
	}

	@Override
	public List<Document> serachDocument(String searchTitle) {
		List<Document> documents = documentdao.list();
		List<Document> filterlist = new ArrayList();
		for (Document doc : documents) {
			if (doc.getTitle().contains(searchTitle)) {
				filterlist.add(doc);
			}
		}
		return filterlist;
	}

	@Override
	public Document findById(int id) {
		// TODO
		return null;
	}

	@Override
	public List<Document> duplicateList() {
		List<Document> documentlist = documentdao.list();
//		for (Document document : documentlist) {
//			System.out.println(document);
//		}
//		List<Document> duplicatelist = null;
//		if (documentlist.size() != 0 || documentlist.size() != 1) {
//			Iterator<Document> itr1 = documentlist.iterator();
//			Set nonduplicate = new TreeSet();
//			Iterator<Document> itr2 = nonduplicate.iterator();
//			Iterator<Document> itr3 = documentlist.iterator();
//			while(itr3.hasNext()) {
//				nonduplicate.add(itr3.next());
//			}
//			System.out.println("non duplicate"+nonduplicate.size());
//		//	System.out.println(documentlist.size());
//			while (itr2.hasNext()) {
//				Document doc = itr1.next();
//				if (itr1.next() != doc) {
//					duplicatelist.add(doc);
//				}
//			}
//		}
//		//System.out.println(duplicatelist.size());
//		return duplicatelist;
//
//	}
		boolean flag = false;
		List<Document> duplicatedocument = new ArrayList();
		for (int i = 0; i < documentlist.size(); i++) {
		
			for (int j = i+1; j < documentlist.size(); j++) {
				if(documentlist.get(i).getId() == documentlist.get(j).getId() && flag == false) {
					
					
				for (Document document : duplicatedocument) {
					if(document == documentlist.get(i)) {
						flag = true;
					}
				}
				if(flag != true) {
					duplicatedocument.add(documentlist.get(i));
				}
					
				}
			}
		}
		return duplicatedocument;
		
	}
}
