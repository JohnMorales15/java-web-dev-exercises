package exercises;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        int x = input.nextInt();
        System.out.println("Width of rectangle: ");
        int y = input.nextInt();
        System.out.println("Area of rectangle: " + (x*y));

    }
}
