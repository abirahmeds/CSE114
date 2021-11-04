package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Part 1
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(m);
        print(m);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");
        int myInt = sc.nextInt();

        MyInteger num1 = new MyInteger(myInt);
        MyInteger num2 = new MyInteger(1);


        System.out.println("The statement integer1 equals interger2 is: " + num1.equals(num2));
        System.out.println("MyInteger 1 is " + num1.getValue());
        if (num1.isPrime()){
            System.out.println("MyInteger 1 is prime");
        }else{
            System.out.println("MyInteger 1 is not prime");
        }

        if(num1.isEven()){
            System.out.println("MyInteger 1 is even");
        }else if(num1.isOdd()){
            System.out.println("MyInteger 1 is is odd");
        }
        if (num1.equals(5)){
            System.out.println("MyInteger 1 is equal to 5");
        }else{
                System.out.println("MyInteger 1 is not equal to 5");
        }
        if (num1.equals(num2)){
            System.out.println("MyInteger 1 is equal to " + num2.getValue());
        }else{
            System.out.println("MyInteger 1 is not equal to " + num2.getValue());
        }

    }

    public static void sort(int[][] m){
        int[] x = new int[2];
        for(int row = 0; row < m.length - 1; row++){
            x[0] = m[row][0];
            x[1] = m[row][1];
            int index = row;
            for (int i = row + 1; i < m.length; i++) {
                if (m[i][0] <= x[0] && (m[i][0] < x[1] ||
                        m[i][1] < x[0] || m[i][1] < x[1])) {
                    x[0] = m[i][0];
                    x[1] = m[i][1];
                    index = i;
                }
            }
            if (index != row){
                m[index][0] = m[row][0];
                m[index][1] = m[row][1];
                m[row][0] = x[0];
                m[row][1] = x[1];
            }
        }
    }

    public static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
