//Abir Ahmed 112751779
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        System.out.print("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < x.length; k++) {
            x[k] = sc.nextInt();
        }
        System.out.println("The distinct integers are: ");
        print(eliminateDuplicate(x));


    }

   public static int[] eliminateDuplicate(int[] list) {
        int counter;
        int place = 0;
        int[] array1 = new int[10];
        for (int i = 0; i < list.length; i++) {
            counter = 0;
            for(int j = 0; j < i; j++){
                if ((list[i] == list[j])){
                    counter++;
                }
            }
            if (counter == 0){
                array1[place] = list[i];
                place++;
            }
        }
        return array1;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++){
            if (a[i] != 0){
                System.out.print(a[i] + " ");
            }
        }
    }

}