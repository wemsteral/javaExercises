// what imports will you need?
import java.io.*;
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
public static void main(String[] args) {

        boolean isNotSeventeen = true;
        while (isNotSeventeen) {

                System.out.println("Please enter a number:");

                Scanner scan = new Scanner(System.in);
                int i = scan.nextInt();
                if(i == 17) {
                        System.out.println("goodbye");
                        isNotSeventeen = false;
                }else if(i%2==0) {
                        System.out.println(i + " is even");
                }else{
                        System.out.println(i + " is odd");
                }
        }

}
}

// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
