package com.company;

public class Complex {

    private double real;
    private double imaginary;

    //default no-arg constructor
    public Complex(){
        real = 1;
        imaginary = 1;
    }

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    double getReal(){
        return real;
    }

    double getImaginary(){
        return imaginary;
    }

    public Complex add (Complex a){
        double r = this.real + a.getReal();
        double im = this.imaginary + a.getImaginary();
        return new Complex(r, im);
    }

    public Complex subtract (Complex a){
        double r = this.real - a.getReal();
        double im = this.imaginary - a.getImaginary();
        return new Complex(r, im);
    }

    public String toString(){
        return ("(" + real + ", " + imaginary + ")");
    }
}
