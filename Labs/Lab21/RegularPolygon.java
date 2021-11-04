package com.company;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //default no-arg constructor
    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    double getPerimeter(){
        return (n * side);
    }

    double getArea(){
        return ((n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n)));
    }

    double getN(){
        return n;
    }

    double getSide(){
        return side;
    }

    double getXC(){
        return x;
    }

    double getYC(){
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
