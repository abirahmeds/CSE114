package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //This is part 1 of the lab
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance and interest rate: ");
        double b = sc.nextDouble();
        double ir = sc.nextDouble();
        double i = b * (ir/1200);
        System.out.println("The interest is " + i);

        //This is the second part of the lab
        System.out.print("Enter x1 and y1: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double xx = sc.nextDouble();
        double yy = sc.nextDouble();
        double a = Math.pow((xx - x), 2) + Math.pow((yy - y), 2);
        double d = Math.pow(a, 0.5);
        System.out.println("The distance between the two points is: " + d);
    }
}

