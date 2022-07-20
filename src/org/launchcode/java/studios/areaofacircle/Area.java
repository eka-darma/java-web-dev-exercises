package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Double pi = 3.14;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a Radius: ");
        Double r = input.nextDouble();

        if (r < 0) {
            System.out.println("Radius must be Positive Number");
        } else {
            // Double A = pi * r * r;
            Double A = Circle.getArea(r); // Calling the Circle.java
            System.out.println("The area of a circle of radius " + r + " is: " + A);
        }
    }
}
