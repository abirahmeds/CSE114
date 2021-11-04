package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = sc.nextDouble();
            }
        }
        m = sortRows(m);
        System.out.println("The row-sorted array is: ");
        print(m);
    }

    public static double[][] sortRows(double[][] m){
            double temp;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length - 1; j++) {
                    if (m[i][j] > m[i][j+1]) {
                        temp = m[i][j];
                        m[i][j] = m[i][j + 1];
                        m[i][j + 1] = temp;
                    }
                }
            }
            return m;
    }

    public static void print(double[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

