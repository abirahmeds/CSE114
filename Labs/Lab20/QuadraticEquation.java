package com.company;

public class QuadraticEquation {
    private double a, b , c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA(){
        return a;
    }

    double getB(){
        return b;
    }

    double getC(){
        return c;
    }

    double getDiscriminant(){
        return (Math.pow(b, 2) - (4 * a * c));
    }

    double getRoot1(){
        return getDiscriminant() < 0 ? 0 : ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    double getRoot2() {
        return getDiscriminant() < 0 ? 0 : ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
