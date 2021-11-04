package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of rows: ");
                int nor = sc.nextInt();
                displayPattern(nor);

                System.out.println("Enter an integer you want reversed: ");
                int num = sc.nextInt();
                reverse(num);


            }

        public static void displayPattern(int n) {
            int a = n - 1;
            for (int i = 1; i <= n; i++) {
                for (int p = 0; p < a; p++) {
                    System.out.print("  ");
                }
                for (int r = i; r > 0; r--) {
                    System.out.print(r + " ");
                }
                System.out.println();
                a--;
            }
        }

            public static void reverse(int number){
                while (number > 0){
                    System.out.print(number % 10);
                    number /= 10;
                }
                System.out.println();
            }
    }

