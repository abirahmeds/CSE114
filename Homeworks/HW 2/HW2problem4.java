package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        //This is the fourth HW problem
        int m = 0;
        char c1, c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        String str1 = s1.replaceAll(" ", "");
        str1 = str1.toLowerCase();
        String str2 = s2.replaceAll(" ", "");
        str2 = str2.toLowerCase();
        int len = str1.length(), l = str1.length();
        if (l != str2.length()) {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams");
        } else {
            for (int i = 0; i < len; i++) {
                c1 = str1.charAt(i);
                for (int a = 0; a < len; a++) {
                    c2 = str2.charAt(a);
                    if (c2 == c1) {
                        m = m + 1;
                        str2 = str2.replaceFirst(String.valueOf(c2), "");
                        a = len;
                    }
                }
            }
            if (m == l) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            } else {
                System.out.print(s1 + " and " + s2 + " are NOT anagrams");
            }
        }
    }
}