package exercises;
import java.util.Scanner;
// Java code for printing out Hello World!

public class Hello {

    public static void main(String[] args) {
        // write code in here that you want to execute
        // get user's name
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = in.nextLine();

        System.out.println("Hello " + name + "!");
    }
 }
