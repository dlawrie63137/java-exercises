package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        // write code in here that you want to execute
        // declare variables
        Scanner in;
        float radius;
        double area;
        final double PI = 3.14;

        do {
            // get radius from user
            in = new Scanner(System.in);
            System.out.println("Enter the radius of your circle: ");
            radius = in.nextFloat();
        } while (radius < 0);

        // calculate area
        area = PI * (radius * radius);

        // print area
        System.out.println("The area of your circle is " + area + " square units.");

    }
}
