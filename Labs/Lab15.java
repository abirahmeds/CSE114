package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the side: ");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        System.out.println("The area of the pentagon is: " + area(n));

        for(int i = 2; i < 1000; i++){
            if(isPrime(i) && isPrime(i+2)){
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
        System.out.println();

    }

        public static double area(double side){
            double num = Math.pow(side, 2) * 5;
            double den = Math.tan((Math.PI)/5) * 4;
            return (num/den);
        }

        public static boolean isPrime(long j){
            if (j < 2) return false;
            for(int l = 2; l <= (j/2); l++) {
                if (j % l == 0) return false;
            }
            return true;
            }
        }

