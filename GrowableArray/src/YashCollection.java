/**
 *  Prog : Yash Collection
 *  Author : Aditi Jain
 *  Date : 09-10-2018
 *  Desc : Operations on collection.
 */

import java.util.Arrays;

public class YashCollection {
	Object objArray[] = new Object[10];
	int elementCount = 0;
	
	/**
	 * Insert elements in an object[]
	 * Check for the condition if reached then increase capacity by double
	 * Copy old array elements into the new array and assign new array reference to old array
	 * @param obj
	 */
	public void add(Object obj) {
		if (elementCount >= objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
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
	
	/**
	 * Create method countElement for object[] 
	 * Count the total elements in the new object array
	 * @return counter in the array
	 */
	public int countElement() {
		int counter = 0;
		for (int i = 0; i < objArray.length; i++)
			if (objArray[i] != null)
				counter++;
		return counter;
	}
	
	/**
	 * Create method searchElement for object[]
	 * Give an element to be searched
	 * Condition satisfied then return true
	 * @param obj
	 * @return true if search is successful
	 */
	public boolean searchElement(Object obj) {
		for (int i = 0; i < objArray.length; i++) {
			if (objArray[i] == obj) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Create method retrieveElement for object[]
	 * An index is given for retrieving an element
	 * Condition satisfied then value is obtained
	 * @param value
	 * @return null if value not available on the index
	 */
	public Object retrieveElement(int value) {
		for (int i = 0; i < objArray.length; i++) {
			if (i == value - 1) {
				return objArray[value];
			}
		}
		return null;
	}

	public boolean removeElement(Object element) {
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
	

	public Object insertElement(int index, Object element) {
		Object temp, temp1;
		temp = objArray[index];
		objArray[index] = element;
		if (elementCount + 1 > objArray.length) {
			increaseCapacity();
			elementCount++;
		}
		for (int i = index + 1; i < elementCount; i++) {
			temp1 = objArray[i];
			objArray[i] = temp;
			temp = temp1;
		}
		return element;
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
