package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] x = new double[10];
        System.out.print("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        for(int k = 0; k < x.length; k++) {
            x[k] = sc.nextDouble();
        }
        System.out.println("The mean is: " + String.format("%.3g%n", mean(x)));
        System.out.println("The standard deviation is: " + String.format("%.6g%n", deviation(x)));
        System.out.println("The reversed array is: ");
        System.out.print("The reversed array: ");
        x = reverse(x);
        for (int i = 0;i < x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }



    public static double deviation(double[] numbers){
        double mean = mean(numbers);
        double deviation = 0;
        for (int i = 0; i < numbers.length; i++) {
            deviation += Math.pow(numbers[i] - mean, 2);
        }
        return Math.sqrt(deviation / (numbers.length - 1));
    }

    public static double mean(double[] numbers){
        double sum = 0, mean = 0;
        for(int j = 0; j < numbers.length; j++){
            sum += numbers[j];
        }
        mean = (sum)/numbers.length;
        return mean;
    }

    public static double[] reverse(double[] numbers) {
        double temp;
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }
}

