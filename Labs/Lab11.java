package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the first program
        Scanner sc = new Scanner(System.in);
        int p = 0;
        while (p == 0) {
            System.out.println("Enter the phone number: ");
            String num = sc.nextLine();
            if (num.length() != 10) {
                System.out.println("Invalid input. Please enter 10 digits.");
            } else {
                String s1 = num.substring(0, 3);
                String s2 = num.substring(3, 6);
                String s3 = num.substring(6);
                System.out.println("Formatted phone number: (" + s1 + ")" + s2 + "-" + s3);
                p++;
            }
        }

        //This is the second program
        int v = 0;
        while (v == 0) {
            System.out.println("Enter a SSN in the format DDD-DD-DDDD: ");
            String ssn = sc.nextLine();
            if ((ssn.length() == 11) && (Character.isDigit(ssn.charAt(0))) && (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2)))  && (ssn.charAt(3) == '-') &&
                    (Character.isDigit(ssn.charAt(4))) && (Character.isDigit(ssn.charAt(5))) && (Character.isDigit(ssn.charAt(7))) && (ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(8))) &&
                    (Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10)))){
                System.out.println(ssn + " is a valid social security number");
            }
            else{
                System.out.println(ssn + " is a invalid social security number");
                v++;
            }
        }
    }
}

        //This is the second program
        int v = 0;
        while (v == 0) {
            System.out.println("Enter a SSN in the format DDD-DD-DDDD: ");
            String ssn = sc.nextLine();
            if ((ssn.length() == 11) && (Character.isDigit(ssn.charAt(0))) && (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2)))  && (ssn.charAt(3) == '-') &&
                        (Character.isDigit(ssn.charAt(4))) && (Character.isDigit(ssn.charAt(5))) && (Character.isDigit(ssn.charAt(7))) && (ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10)))){
                System.out.println(ssn + " is an valid social security number");
            }
            else{
                System.out.println(ssn + " is a invalid social security number");
                v++;
            }
        }
    }
}
