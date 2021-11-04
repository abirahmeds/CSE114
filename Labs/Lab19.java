package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        generateInts();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a 4-by-4 matrix row by row: ");
        double[][] x = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                x[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(x));

    }


    public static void generateInts(){
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int num;
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 10);
            count[num] = count[num] + 1;
        }
        for (int m = 0; m < 10; m++){
            System.out.println("The number of " + m + "'s: " + count[m]);
        }
    }


    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}