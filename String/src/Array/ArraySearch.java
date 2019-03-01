package Array;

import java.util.Scanner;
 
class ArraySearch {
  public static void main(String args[])
  {
    int i, num, search, array[];
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements");
    num = sc.nextInt(); 
    array = new int[num];
 
    System.out.println("Enter " + num + " integers");
 
    for (i = 0; i < num; i++)
      array[i] = sc.nextInt();
 
    System.out.println("Enter value to find");
    search = sc.nextInt();
 
    for (i = 0; i < num; i++)
    {
      if (array[i] == search) {
         System.out.println(search + " is present at location " + (i + 1) + ".");
          break;
      }
   }
   if (i == num) 
      System.out.println(search + " isn't present in array.");
  }
}