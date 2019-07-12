public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String name1 = "Bill";
    // declare the second name
    String name2 = "Mark";
    // create your message
    String message = " went to the shops!";
    // print your message!
    String output = String.format("%s and %s went to the shops!", name1, name2);
    System.out.println (output);
  }
}
