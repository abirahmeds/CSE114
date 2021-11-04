package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first part of the lab
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double in = sc.nextDouble();
        double kil = pounds *  0.45359237;
        double met = in * 0.0254;
        double bmi = kil/(Math.pow(met, 2));
        System.out.println("BMI is " + String.format("%.4f",bmi));

        //This is the second part of the lab
        System.out.print("Enter the driving distance: ");
        double dd = sc.nextDouble();
        System.out.print("Enter Miles per gallon: ");
        double mpg = sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = sc.nextDouble();
        double cod = (dd/mpg)*ppg;
        System.out.println("The cost of driving is: " + String.format("%.2f",cod));
    }
}
