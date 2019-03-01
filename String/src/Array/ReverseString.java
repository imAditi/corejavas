package Array;
import java.util.Scanner;

class ReverseString { 
public static String reverseIt(String str)
	{
		
		if (str == null || str.equals(""))
			return str;

		char[] c = str.toCharArray();

		
		for (int l = 0, h = str.length() - 1; l < h; l++, h--)
		{
			
			char temp = c[l];
			c[l] = c[h];
			c[h] = temp;
		}
		
		
		return String.copyValueOf(c);
	}

	public static void main(String[] args)
	{
		String str = "Geeks of geeks";

		
		str = reverseIt(str);

		System.out.println("Reverse of the given string is : " + str);
	}
}