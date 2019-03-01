import java.util.LinkedHashSet;
import java.util.Set;

public class SetAdd {
public static void main(String args[]) {
	Set<String> names = new LinkedHashSet<>();
	names.add("Aditi");
	names.add("Jain");
	if(names.add("Crusoe")) {
		System.out.println("Add Crusoe in the set");
	}
	if(!names.add("Aditi")) {
		System.out.println("Aditi is already in the set");
	}

}
}