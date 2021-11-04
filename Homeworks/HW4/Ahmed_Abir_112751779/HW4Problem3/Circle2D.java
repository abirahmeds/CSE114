package com.company;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    //no-arg constructor
    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double getRadius(){
        return radius;
    }

    double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    double getPerimeter(){
        return (2 * Math.PI * radius);
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
    }

    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
    }

}
