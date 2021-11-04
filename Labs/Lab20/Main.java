package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Part 1
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        double width, height;


        System.out.println("Rectangle 1");
        System.out.println("Width:     " + r1.width);
        System.out.println("Height:    " + r1.height);
        System.out.println("Area:      " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // Display the width, height, area, and perimeter of rectangle2
        System.out.println("\nRectangle 2");
        System.out.println("Width:     " + r2.width);
        System.out.println("Height:    " + r2.height);
        System.out.println("Area:      " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        //Part 2
        double a, b, c;
        System.out.println("Enter a, b ,c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        if (quad.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else if (quad.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + quad.getRoot1() + " and " + quad.getRoot2());
        } else {
            System.out.println("The equation has one root " + (quad.getRoot1() > 0 ? quad.getRoot1() : quad.getRoot2()));
        }
        sc.close();
    }
}
