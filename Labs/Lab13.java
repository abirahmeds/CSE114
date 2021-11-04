package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(count("giraffe", 'f'));

        double first  =  1.0;
        double rows = 20.0;
        System.out.println("\ni         m(i)     ");
        for (double i = first; i <= rows; i++) {
            System.out.print("\n" + (int)i + "         " + String.format("%.4f", summation(i)));
            }
        }

        public static int count(String str, char a) {
            int j = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == a)
                    j++;
            }
            return j;
        }

        public static double summation(double n){
            double sum = 0;
            for (double i = 1; i <= n; i++) {
                sum += (i / (i + 1));
            }
            return sum;
        }
}