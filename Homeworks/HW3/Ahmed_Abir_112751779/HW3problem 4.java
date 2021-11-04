//Abir Ahmed 112751779
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m1[][] = new double[3][3];
        double m2[][] = new double[3][3];
        double d[][] = new double[3][3];
        System.out.println("Enter matrix 1: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                double matrix1 = input.nextDouble();
                m1[i][j] = matrix1;
            }
        }

        System.out.println("Enter matrix 2: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                double matrix2 = input.nextDouble();
                m2[i][j] = matrix2;
            }
        }

        System.out.println("Multiplication of the matrices is: ");
        print(multiplyMatrix(m1, m2));
    }

    public static double[][] multiplyMatrix(double[][] a, double [][] b) {
        double[][] c = new double[3][3];
        for(int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void print(double[][] a){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Math.round(a[i][j] * 10.0) / 10.0 + " ");
            }
            System.out.println();
        }
    }
}
