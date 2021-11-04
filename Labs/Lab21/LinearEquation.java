package com.company;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }

    double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }

    double getC(){
        return c;
    }
    public void setC(double c){
        this.c = c;
    }

    double getD(){
        return d;
    }
    public void setD(double d){
        this.d = d;
    }

    double getE(){
        return e;
    }
    public void setE(double e){
        this.e = e;
    }

    double getF(){
        return f;
    }
    public void setF(double f){
        this.f = f;
    }

    boolean isSolvable(){
        return (((a*d) - (b*c)) != 0);
    }

    double getX(){
        return (((e*d) - (b*f))/((a*d) - (b*c)));
    }

    double getY(){
        return (((a*f) - (e*c))/((a*d) - (b*c)));
    }
}
