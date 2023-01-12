package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles driven: ");
        double x = input.nextDouble();
        System.out.println("Amount of gas used (gallons): ");
        double y = input.nextDouble();
        System.out.println("Miles per gallon: " + (x/y));
    }
}
