package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle2D c1 = new Circle2D(2, 2, 5.5);
	    System.out.println("The area of c1 is " + c1.getArea());
        System.out.println("The perimeter of c1 is " + c1.getPerimeter());
        System.out.println("The result of c1 containing (3, 3) is:" + c1.contains(3,3));
        System.out.println("The result of c1 containing a new circle with a center at (4, 5) and a radius of 10.5:" + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("The result of c1 overlapping a new circle with a center at (3, 5) and a radius of 2.3:" + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
