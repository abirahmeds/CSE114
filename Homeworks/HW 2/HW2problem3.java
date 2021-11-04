package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        //This is the third HW problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String s = sc.nextLine();
        String str = s.toLowerCase();
        str = str.replaceAll(" ", "");
        int length = str.length() / 2;
        int i = 0;
        while (i < length){
            if (str.charAt(i) != str.charAt(str.length() - (i+1))){
                System.out.println(str + " is NOT a palindrome");
                return;
            }else{
                i++;
            }
        }
        System.out.println(s + " is a palindrome");
    }
}
