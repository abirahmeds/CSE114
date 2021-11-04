package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the second HW problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        int word = sc.nextInt();
        int temp;
        int max = 0;
        int count = 0;
        while(word > 0){
            temp = word % 10;
            word = word / 10;
            if (temp == 1){
                count++;
                if (max < count) {
                    max = count;
                }
            }else if (temp == 0){
                count = 0;
            }else{
                System.out.println("The input word is not a valid binary number");
                return;
            }
        }
        if (max >= 3){
            System.out.println("The binary word is accepted");
        }else{
            System.out.println("The binary word is rejected");
        }
    }
}