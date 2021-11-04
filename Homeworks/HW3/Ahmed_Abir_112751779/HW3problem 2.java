//Abir Ahmed 112751779
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = sc.nextInt();
        int[] l1 = new int[size1];
        for (int k = 0; k < size1; k++) {
            l1[k] = sc.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int size2 = sc.nextInt();
        int[] l2 = new int[size2];
        for (int k = 0; k < size2; k++) {
            l2[k] = sc.nextInt();
        }

        System.out.print("List1 is ");
        print(l1);
        System.out.print("\nList2 is ");
        print(l2);

        System.out.print("\nThe merged list is ");
        print(merge(l1, l2));
    }


    public static int[] merge(int[] list1, int[] list2) {
        int[] list = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++)
            list[i] = list1[i];

        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            list[j] = list2[i];
        }
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}