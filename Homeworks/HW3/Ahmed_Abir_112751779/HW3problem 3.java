//Abir Ahmed 112751779
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 strings: ");
        String cities = input.nextLine();
        String[] strings = cities.split(", ");
        System.out.println("Sorted strings: ");
        bubbleSort(strings);
        print(strings);
    }

    public static void bubbleSort(String[] x) {
        String temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if ( x[j].compareTo(x[j + 1]) > 0) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }

    public static void print(String[] a){
        for (String s : a) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}