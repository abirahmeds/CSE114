package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is the first part of the lab
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double c = sc.nextDouble();
        double a = (9.0/5) * c + 32;
        System.out.println(c + " Celsius is " + a + " Farenheit");

        //This is the second part of the lab
        System.out.print("Enter the amount of water in kilograms: ");
        double w = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double t0 = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        double t1 = sc.nextDouble();
        double q = w * (t1 - t0) * 4184;
        System.out.println("The energy needed is " + q);
    }
}