package com.yash.docapp.serviceimpl;

import java.util.Comparator;

import com.yash.docapp.domain.Document;

public class Sorting implements Comparator<Document>{

	@Override
	public int compare(Document D1, Document D2) {
		// TODO Auto-generated method stub
		return D1.getId()-D2.getId();
	}

}
