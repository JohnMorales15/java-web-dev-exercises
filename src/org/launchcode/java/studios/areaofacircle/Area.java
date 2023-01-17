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
        while (r < 0){
            System.out.println("Radius cannot be less than 0!");
            r = input.nextDouble();
        }
        System.out.println("The area of a circle with a radius "+ r + " is: " + Circle.getArea(r));
    }
}

