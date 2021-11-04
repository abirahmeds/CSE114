package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first part of the lab
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58 Fahrenheit and 41 Fahrenheit: ");
        double ta = sc.nextDouble();
        while((ta < -58) || (ta > 41)){
            System.out.print("Enter the temperature in Fahrenheit between -58 Fahrenheit and 41 Fahrenheit: ");
            ta = sc.nextDouble();
        }
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double v = sc.nextDouble();
        while (v < 2){
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            v = sc.nextDouble();
        }
        double twc = 35.74 +(0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
        System.out.println("The wind chill index is " + String.format("%.5f", twc));

        //This is the second part of the lab
        System.out.print("Enter the length of the side: ");
        double s = sc.nextDouble();
        double area = (3 * Math.sqrt(3) * Math.pow(s, 2))/2;
        System.out.println("The area of the hexagon is " + String.format("%.4f", area));
    }
}