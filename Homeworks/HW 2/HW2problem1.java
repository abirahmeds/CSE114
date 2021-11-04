package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first HW problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user ID: ");
        String id = sc.nextLine();
        int len = id.length();
        int i = 0;
        int digits = 0;

        /* This while loop checks for how many digit there are using the isDigit() function **/
        while (i < len) {
            if (Character.isDigit(id.charAt(i))) {
                digits++;
            }
            i++;
        }

        /* We verify whether the input user ID is valid using an if else
          statement to check if there are exactly two digits or not
         */
        if (digits == 2){
            System.out.println("The input user ID is valid");
        }else{
            System.out.println("The input user ID is invalid");
        }
    }
}