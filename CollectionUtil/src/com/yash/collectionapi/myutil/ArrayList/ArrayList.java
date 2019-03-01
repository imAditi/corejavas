package com.yash.collectionapi.myutil.ArrayList;

public abstract class ArrayList<E> implements List<E>{

	public class YashCollection {
		Object objArray[] = new Object[10];
		int elementCount = 0;
		
		public void add(E element) {
			if (elementCount >= objArray.length) {
				increaseCapacity();
			}
			objArray[elementCount] = element;
			elementCount++;
		}

		public void increaseCapacity() {
			newArrayCollection();
		}

		private void newArrayCollection() {
			int newCapacity = objArray.length * 2;
			Object[] newArray = new Object[newCapacity];
			for (int i = 0; i < objArray.length; i++) {
				newArray[i] = objArray[i];
			}
			objArray = newArray;
		}
		
		public int countElement() {
			int counter = 0;
			for (int i = 0; i < objArray.length; i++)
				if (objArray[i] != null)
					counter++;
			return counter;
		}
	
		public boolean searchElement(E element) {
			for (int i = 0; i < objArray.length; i++) {
				if (objArray[i] == element) {
					return true;
				}
			}

			return false;
		}

		public boolean removeElement(E element) {
			Object temp = 0;
			for (int i = 0; i < elementCount; i++) {
				if (objArray[i] == element) {
					objArray[i] = null;
					for (int j = i; j < elementCount - 1; j++) {
						temp = objArray[j + 1];
						objArray[j] = temp;
					}
					elementCount--;
					return true;
				}
			}
			return false;
		}
	
		public boolean replaceElement(int index, Object element) {
			objArray[index - 1] = element;
			return true;
		}
		
	    @Override
	    public String toString() {
	           StringBuilder s2 = new StringBuilder();
	           s2.append("{");
	           for (int i = 0; i < elementCount; i++) {
	                  s2.append(objArray[i]);
	                  if (i < (elementCount - 1)) {
	                        s2.append(",");
	                  }
	           }
	           s2.append("}");
	           return s2.toString();
	    }

		public Object[] list() {
			return objArray;
		}
	}
}
