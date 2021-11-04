package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        double side1 = sc.nextDouble(); double side2 = sc.nextDouble(); double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Enter a color: ");
        String color = sc.next();
        triangle.setColor(color);

        System.out.print("Is the triangle filled or not, enter either true or false? ");
        boolean filled = sc.nextBoolean();
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is " + (triangle.isFilled() ? "" : "not ") + "filled");
    }
}
