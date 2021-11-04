//Abir Ahmed 112751779
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Complex c1 = new Complex();
            Complex c2 = new Complex();
            double real, imaginary;


            System.out.print("Enter real part of the first complex number: ");
            real = sc.nextDouble();
            System.out.print("Enter imaginary part of the first complex number: ");
            imaginary = sc.nextDouble();
            c1 = new Complex(real, imaginary);


            System.out.print("Enter real part of the second complex number: ");
            real = sc.nextDouble();
            System.out.print("Enter imaginary part of the second complex number: ");
            imaginary = sc.nextDouble();
            c2 = new Complex(real, imaginary);
            String s = sc.nextLine();


            System.out.println("First complex number is : " + c1);
            System.out.println("Second complex number is : " + c2);


            Complex addition = c1.add(c2);
            System.out.println("Addition Result : " + addition);


            Complex subtraction = c1.subtract(c2);
            System.out.println("Addition Result : " + subtraction);

            sc.close();
    }

}

