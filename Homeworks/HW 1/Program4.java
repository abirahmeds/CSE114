//Name: Abir Ahmed SBU ID: 112751779
package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //This is the fourth program
        int digits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer with 5 digits: ");
        int n = sc.nextInt();
        int five = n;

        /*This while loop below checks to see how many digits an integer has and assigns the value of how many
        digits it has to the int "digits". Dividing by ten until n is 0 gets the amount of places the digit has.
         */
        while (five != 0){
            five /= 10;
            digits++;
        }

        /*These statements below get the value at each digit place by dividing by a number to
        get the digit in a certain position and then use the modulo operator (%) to assign that digit to the
        integer that was initialized
         */
        int a = n / 10000 % 10;
        int b = n / 1000 % 10;
        int c = n / 100 % 10;
        int d = n / 10 % 10;
        int e = n % 10;

        /*This if statement prints out the 5 digits with spaces
        after checking that the integer is positive and does in fact
        have 5 digits, nothing more and nothing less
         */
        if ((n <= 0) || (digits != 5)){
            System.out.println("Invalid Input");
        }else{
            System.out.println(a + " " + b + " " + c + " " +  d + " " + e);
        }

        /*                     Word Answer to Program 4
        I modified my program to prevent errors by catching the length of the integer that
        the user inputs by using the while loop in the beginning by dividing int n by 10 until n is zero to
        get the amount of places the digit has (ones, tens, hundreds, etc). This assigns the
        amount of digits in 'int n' to 'int digits'. I then use the value of 'int digits' in
        an if statement where it would print out "Invalid Input" if the value is not equal to 5.
        This prevents the program from running an integer that is more than or less than 5 digits long.
        I also included "n <= 0" in my if statement to prevent the program from running if the user inputs
        a non-positive integer.
         */

    }
}
