package com.company;

public class Main {

    public static void main(String[] args) {
        //This is the first part
        double sum, div, n, d;
        sum = 0;
        n = 1;
        d = 3;
        while ((n < 98) && (d < 100)) {
            div = n / d;
            sum += div;
            n += 2;
            d += 2;
        }
        System.out.println(String.format("%.4f",sum) + " is the sum");

        //This is the second part
        for (int num = 2; num <= 10000; num++) {
            int su = 0;
            int di = 1;
            while (di < num) {
                if (num % di == 0) {
                    su += di;
                }
                di++;
            }
            if (num == su) {
                System.out.println(num + " is a perfect number");
            }
        }
    }
}
