package com.company;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //This is the first part of my lab
        int r = (int)(Math.random() * 27);
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("A random uppercase letter is " + alph.charAt(r));

        //This is the second part
        String a, b, c;
        a = String.valueOf(alph.charAt((int)(Math.random() * 27)));
        b = String.valueOf(alph.charAt((int)(Math.random() * 27)));
        c = String.valueOf(alph.charAt((int)(Math.random() * 27)));
        int d = (int)(Math.random() * 10);
        int e = (int)(Math.random() * 10);
        int f = (int)(Math.random() * 10);
        int g = (int)(Math.random() * 10);
        System.out.println(a + b + c + d + e + f + g);
    }
}