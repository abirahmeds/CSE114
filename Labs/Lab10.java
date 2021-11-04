package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first part of my lab
        int i = 0;
        int sum = 0;
        int avg = 0;
        while (i < 11){
            sum += (int)(Math.random() * 100);
            i++;
        }
        avg = sum / 10;
        System.out.println("The average of the 10 random integers is " + avg);

        //This is the second part
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String one = sc.nextLine();
        System.out.println("Enter the second city: ");
        String two = sc.nextLine();
        System.out.println("Enter the third city: ");
        String three = sc.nextLine();
        String temp;
        if ((two.compareTo(one) < 0) && (two.compareTo(three) < 0))
        {
            temp = one;
            one = two;
            two = temp;
        }
        else if ((three.compareTo(one) < 0) && (three.compareTo(two) < 0))
        {
            temp = one;
            one = three;
            three = temp;

        }
        if (three.compareTo(two) < 0)
        {
            temp = two;
            two = three;
            three = temp;
        }
        System.out.println("The three cities in alphabetical order are " + one + ", " + two + ", " + three);
    }
}