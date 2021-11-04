package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Part 1
        Scanner sc = new Scanner(System.in);
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);



        System.out.println("Regular Polygon 1");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("\nRegular Polygon 2");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println("\nRegular Polygon 3");
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());

        //Part 2
        double a, b, c, d, e, f;
        System.out.println("\nEnter a, b, c, d, e, and f: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();

        LinearEquation linear = new LinearEquation(a, b, c, d, e, f);

        if (linear.isSolvable()){
            System.out.println("X is " + linear.getX() + " and y is " + linear.getY());
        }else {
            System.out.println("The equation has no solutions.");
        }
        sc.close();
    }
}
