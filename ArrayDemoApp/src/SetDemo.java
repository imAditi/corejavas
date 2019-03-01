import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
public static void main(String args[]) {
	List<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,6,3,8,9,0,4));
	System.out.println(listNumbers);
	Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
	System.out.println(uniqueNumbers);
}
}
