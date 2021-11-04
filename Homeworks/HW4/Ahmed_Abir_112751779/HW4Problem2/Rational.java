package com.company;

public class Rational {
    private int num;
    private int den;

    public Rational(){
        num = 1;
        den = 2;
    }

    public Rational(int num, int den){
        int gcd = gcd(num, den);
        this.num = num/gcd;
        this.den = den/gcd;
    }

    public static int gcd(int n, int d){
        if (d == 0){
            return n;
        }else {
            return gcd(d, n % d);
        }
    }
    public int getNum(){
        return num;
    }

    public Rational add(Rational r) {
        int numer = num * r.den + r.num * den;
        int denom = den * r.den;
        return new Rational(numer, denom);
    }
    public Rational subtract(Rational r) {
        int numer = num * r.den - r.num * den;
        int denom = den  * r.den;
        return new Rational(numer, denom);
    }
    public Rational multiply(Rational r) {
        int numer = num * r.num;
        int denom = den * r.den;
        return  new Rational(numer, denom);
    }
    public Rational divide(Rational r) {
        int numer = num * r.den;
        int denom = den * r.num;
        return new Rational(numer, denom);
    }

    public String toString() {
        return "(" + num + "/" + den + ")";
    }
}
