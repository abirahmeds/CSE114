//Name: Abir Ahmed SBU ID: 112751779
package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //This is the first program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter Side 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter Side 3: ");
        double s3 = sc.nextDouble();

        /*The if-else statements below do all the necessary comparing
        to identify which type of triangle it is, depending on the user input
        of all three side lengths
        */
        if ((s1 + s2 <= s3) || (s2 + s3 <= s1) || (s1 + s3 <= s2)) {
            System.out.println("Invalid Output!");
        } else if ((s1 == s2) && (s2 == s3)) {
            System.out.println("Equilateral");
        } else if ((s1 == s2) || (s2 == s3) || (s1 == s3)) {
            System.out.println("Isosceles");
        } else if ((s1 != s2) && (s2 != s3) && (s1 != s3)) {
            System.out.println("Scalene");
        }
    }
}