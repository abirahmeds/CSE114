package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = dec2Bin(decimal);
        System.out.println("The binary value of " + decimal + " is " + binary);

        System.out.println("Enter a binary number: ");
        String binary2 = sc.next();
        int decimal2 = bin2Dec(binary2);
        System.out.println("The decimal value of " + binary2 + " is " + decimal2);

    }

    public static String dec2Bin(int decimal){
        String binary = "";
        for (int i = decimal; i > 0; i /= 2){
            binary = (i%2) + binary;
            }
        return binary;
    }

    public static int bin2Dec(String binaryString){
        int i = (binaryString.charAt(0) == '1') ? 1 : 0;
        if (binaryString.length() == 1)
            return i;
        else {
            return ((int) Math.pow(2, binaryString.length() - 1) * i + bin2Dec(binaryString.substring(1)));
        }
    }
}

