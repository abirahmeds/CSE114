package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is part 1 of the lab
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double dis = Math.pow(b,2) - (4 * a * c);
        double r1 = ((-b + Math.pow(dis,.5)) / (2*a));
        if (dis > 0){
            double r2 = ((-b - Math.pow(dis,.5)) / (2*a));
            System.out.println("The equation has two roots: " + String.format("%.6f", r1) + " and " + String.format("%.6f", r2));
        }else if (dis == 0){
            System.out.println("The equation has one root: " + String.format("%.6f", r1));
        }else{
            System.out.println("The equation has no real roots.");
        }

        //This is the second part of the lab
        System.out.print("Enter the weight of the package: ");
        double w = sc.nextDouble();
        if ((w < 0) || (w == 0)){
            System.out.println("Invalid Input");
        }else if (w > 20){
            System.out.println("This package cannot be shipped");
        } else if ((w > 0) && (w <= 1)){
            System.out.println("The shipping cost is: 3.5");
        }else if ((w > 3) && (w <= 10)) {
            System.out.println("The shipping cost is: 8.5");
        }else if ((w > 10) && (w <= 20)) {
            System.out.println("The shipping cost is: 10.5");
        }
    }
}


