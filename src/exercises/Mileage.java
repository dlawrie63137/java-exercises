package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        // write code in here that you want to execute
        // declare variables
        float milesDriven;
        float galsGas;
        float mpg;
        Scanner in;

        // get  miles driven and gas used from user
        in = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        milesDriven = in.nextFloat();

        System.out.println("Enter the amount of gas used (in gallons): ");
        galsGas = in.nextFloat();

        // calculate mpg
        mpg = milesDriven / galsGas;
        System.out.println("Your mileage is " + mpg + " miles per gallon.");

    }
}
