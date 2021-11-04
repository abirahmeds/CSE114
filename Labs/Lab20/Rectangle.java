package com.company;

public class Rectangle {
    double width;
    double height;

    //default no-arg constructor
    public Rectangle(){
        width = 1;
        height = 1;
    }

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return (width * height);
    }

    double getPerimeter(){
        return ((2 * width) + (2 * height));
    }
}
