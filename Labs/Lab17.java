package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        int[] x = new int[students];
        System.out.print("Enter " + students + " scores: ");
        for(int k = 0; k < x.length; k++) {
            x[k] = sc.nextInt();
        }
        assignGrade(students, x);

        int[] integers = new int[100];
        int input; int count = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do {
            input = sc.nextInt();
            integers[count] = input;
            count++;
        } while (input != 0);

        count(integers);
    }


    public static void assignGrade(int a, int[] b){
        int best = Math.max(Math.max(b[0], b[1]), Math.max(b[2], b[3]));
        System.out.println(best);
        String grades = "";
        for(int m = 0; m < a; m++){
            if(b[m] >= (best - 10)){
                grades = "A";
            }
            else if(b[m] >= (best - 20)){
                grades = "B";
            }
            else if(b[m] >= (best - 30)){
                grades = "C";
            }
            else if(b[m] >= (best - 40)){
                grades = "D";
            }
            else{
                grades = "F";
            }
            System.out.println("Student " + m + " score is " + b[m] + " and grade is " + grades);
        }
    }

    public static void count(int[] a){
        for(int j = 1; j <= 100; j++){
            int num = 0;
            for(int i = 0; i < a.length - 1; i++) {
                if (a[i] == j) {
                    num++;
                }
            }
            if (num != 0){
                System.out.printf("%d occurs %d %s%n", j, num,num > 1 ? "times" : "time");
            }

        }
    }
}
