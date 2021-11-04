//Name: Abir Ahmed SBU ID: 112751779
package com.company;
import java.util.Scanner;
import java.lang.*;
import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {
        //This is program 2 of the homework
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        /*The code below will take the letter the user inputs
        and turn it into a lower case for efficient comparing
        int the if statements
         */
        char d = sc.next(".").charAt(0);
        char l = toLowerCase(d);

        /*The second if-statement below compares the lower-case version
        of the user input to the vowels only if the user input is a letter.
         */
        if (Character.isLetter(l)) {
            if ((l == 'a') || (l == 'e') || (l == 'i') || (l == 'o') || (l == 'u')) {
                System.out.println(d + " is a vowel");
            } else {
                System.out.println(d + " is a consonant");
            }
        }else{
            System.out.println(d + " is an invalid input");
        }
    }
}
