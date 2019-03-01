package com.yash.collectionapi.myutil.ArrayList;

public interface List<E> extends Collection {

	public void add(E obj);
	public int countElement();
	public boolean searchElement(E obj);
	public boolean removeElement(E element);
	public boolean replaceElement(int index, E element);
	
	
}
