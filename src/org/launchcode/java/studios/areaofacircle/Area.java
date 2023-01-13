package org.launchcode.java.studios.areaofacircle;

import java.awt.geom.Arc2D;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input = new Scanner(System.in);
        Double r = input.nextDouble();
//        double area = (3.14 * r * r);
//        if (r < 0) {
//            System.err.println("Radius cannot be a negative number!");
//        } else if (r.equals("")) {
//            System.err.println("Radius cannot be empty!");
//        } else {
//        } else if (r.isNaN()){
//            System.err.println("Radius is not a Number!");
//        };
            System.out.println("The area of a circle with a radius " + r + " is: " + Circle.getArea(r));
//        }
    }
}
