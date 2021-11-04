package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double[][] x = new double[r][c];
        System.out.println("Enter the array: ");
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                x[i][j] = sc.nextDouble();
            }
        }
        int[] loca = locateLargest(x);
        System.out.println("The location of the largest element is at (" +
        loca[0] + ", " + loca[1] + ")");

        double[][] ma = new double[3][3];
        System.out.println("\nEnter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                ma[i][j] = sc.nextDouble();
            }
        }
        if(isMarkovMatrix(ma)){
            System.out.println("It is a Markov matrix");
        }
        else{
            System.out.println("It is not a Markov matrix");
        }

        }

    public static int[] locateLargest(double[][] a) {
        int[] loc = new int[2];
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max){
                    loc[0] = i;
                    loc[1] = j;
                    max = a[i][j];
                }
            }
        }
        return loc;
    }

    public static boolean isMarkovMatrix(double[][] m){
        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < m.length; i++) {
                double num = m[i][j];
                if (num < 0)
                    return false;
                sum += num;
            }
            if (sum != 1)
                return false;
        }

        return true;
    }
}

