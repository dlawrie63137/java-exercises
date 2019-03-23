package exercises;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        // write code in here that you want to execute
        // declare variables
        double height;
        double width;
        double area;
        Scanner in;

        // get  height and width from user
        in = new Scanner(System.in);
        System.out.println("Enter the height of your rectangle: ");
        height = in.nextDouble();

        System.out.println("Enter the width of your rectangle: ");
        width = in.nextDouble();

        // calculate area
        area = width * height;
        System.out.println("The area of your rectangle is " + area + " square units.");

    }
}
