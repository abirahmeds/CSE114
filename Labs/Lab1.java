package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first program for the lab
        //Shows the perimeter
        System.out.println("The Perimeter of a circle with radius 5.5 is: ");
        System.out.println(2 * 5.5 * Math.PI);
        //Shows the area
        System.out.println("The Area of a circle with radius 5.5 is: ");
        System.out.println(5.5 * 5.5 * Math.PI);

        //This is the second program for the lab
        //Gets input from user for the variable values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting velocity in meters/second: ");
        double v0 = sc.nextDouble();
        System.out.print("Enter the ending velocity in meters/second: ");
        double v1 = sc.nextDouble();
        System.out.print("Enter the time: ");
        double t = sc.nextDouble();
        double a;
        //Calculates average acceleration and outputs it
        a = (v1 - v0)/t;
        System.out.println("The average acceleration is " + a + ": ");
    }
}
