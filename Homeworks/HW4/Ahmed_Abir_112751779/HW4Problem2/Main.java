package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator for the first rational number: ");
        int num = sc.nextInt();
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        int den = sc.nextInt();
        Rational r1 = new Rational(num,den);
        System.out.println("Enter a numerator for the second rational number: ");
        num = sc.nextInt();
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        den = sc.nextInt();
        Rational r2 = new Rational(num,den);
        System.out.println("First rational number is: " + r1);
        System.out.println("Second rational number is: " + r2);
        System.out.println("Addition of the rational numbers is: " + r1.add(r2));
        System.out.println("Subtraction of the rational numbers is: " + r1.subtract(r2));
        System.out.println("Multiplication of the rational numbers is: " + r1.multiply(r2));
        System.out.println("Division of the rational numbers is: " + r1.divide(r2));

    }
}
