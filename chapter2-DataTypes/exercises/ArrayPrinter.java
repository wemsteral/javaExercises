// can you remember how to set up your main function?

import static java.util.Arrays.*;

public class ArrayPrinter {
  public static void main(String[] args) {
    // declare an array of Strings and print it
    String[] myStringArray = new String[3];
    System.out.println(java.util.Arrays.toString(myStringArray));
    // declare an array of integers and print it
    int[] myIntArray = new int[3];
    System.out.println(myIntArray[0]);
    // declare an ArrayList of integers, add numbers to it, and then print it
    myStringArray[0] = "a";
    myIntArray[0] = 1;
    System.out.println(myStringArray[0]);
    System.out.println(myIntArray[0]);
  }
}
