package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //This is the fourth program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the number of sides: ");
        double n = sc.nextDouble();
        System.out.println("Enter the side: ");
        double s = sc.nextDouble();
        double area = (n * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / n)));
        System.out.println("The area of the polygon is " + area);


        //This is the second part of the lab
        int r = (int)(Math.random() * 27);
        String alph = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("A random lowercase letter is " + alph.charAt(r));
    }
}