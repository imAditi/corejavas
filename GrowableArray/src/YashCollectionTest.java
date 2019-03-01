
public class YashCollectionTest {

	public static void main(String args[]) {
		YashCollection yCol = new YashCollection();
		yCol.add("a");
		yCol.add("b");
		yCol.add("c");
		yCol.add(100);
		yCol.add(19.5);
		yCol.add(null);
		yCol.add("a");
		yCol.add("Aditi");
		yCol.add("d");
		//yCol.add("Jain");
//		yCol.add("e");
//		yCol.add("ae");
//		yCol.add("as");
//		yCol.add("aj");
//		yCol.add("ai");
//		yCol.add("k");
//		yCol.add("f");
//		yCol.add("h");
//		yCol.add("l");
//		yCol.add("g");
		print(yCol);
		System.out.println("Total count :" + yCol.elementCount);
		System.out.println("Searched element present:" + yCol.searchElement("Ashwini"));
		System.out.println("Retrieved object:" + yCol.retrieveElement(2));
		System.out.println("Removed object:" + yCol.removeElement("a"));
		print(yCol);
			System.out.println("Replace object: " + yCol.replaceElement(5, "Ashwini"));
			print(yCol);
			System.out.println("insert element:" + yCol.insertElement(1, "Baxter"));
			print(yCol);
			System.out.println(yCol.elementCount);
			//int count = yCol.countElement();
			//System.out.println(count);
			System.out.println(yCol.toString());

		}

	private static void print(YashCollection yCol) {
		Object[] objects = yCol.list();
		for (Object object : objects) {
			System.out.println(object);
		}
	}
	}

