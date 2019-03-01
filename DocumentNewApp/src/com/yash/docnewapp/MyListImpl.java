package com.yash.docnewapp;

import java.util.Arrays;

public class MyListImpl implements MyList{

	static int size = 10;
	static Document arr [] = new Document [size];
	static int counter = 0;
	static int index = -1;
	
	@Override
	public void addDocument(Document document) {
		index++;
		counter++;
		if(counter>arr.length) {
			arr = Arrays.copyOf(arr,  size+1);
			size++;
		}
		arr[index] = document;
	}
	
	@Override
	public Document[] list() {
		return arr;
	}
	

	
	

}
