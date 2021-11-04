package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the fourth program
        int digits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer with 3 digits: ");
        int n = sc.nextInt();
        int three = n;

        while (three != 0){
            three /= 10;
            digits++;
        }

        int c = n / 100;
        int e = n % 10;

        if ((n <= 0) || (digits != 3)){
            System.out.println("Invalid Input");
        }else if (c == e) {
            System.out.println(n + " is a palindrome");
        }else {
            System.out.println(n + " is not a palindrome");
        }


        //This is the second part of the lab
        System.out.println("Enter the x and y coordinates of a point: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double dis = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5);
        if (dis <= 10) {
            System.out.println("(" + x + "," + " " + y + ")" + " is in the circle");
        }else{
            System.out.println("(" + x + "," + " " + y + ")" + " is not in the circle");
        }
    }
}