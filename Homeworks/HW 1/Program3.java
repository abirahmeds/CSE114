//Name: Abir Ahmed SBU ID: 112751779
package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //This is the third program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int dis = sc.nextInt();
        int fare = 0;

        //This if statement below finds the fare value depending on the distance
        if (dis < 0){
            System.out.println("Invalid Input");
        }else if (dis <= 50){
            fare = dis * 3;
        }else if (dis <= 100){
            fare = ((dis-50) * 2) + (50 * 3);
        }else{
            fare = (50 * 3) + (50 * 2) + (dis-100);
        }
        System.out.println(fare);
    }
}
