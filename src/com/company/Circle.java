package com.company;

public class Circle {
    private static double pi = Math.PI;

    public static void calculateArea(double radius) {
        System.out.println("Area of a circle is " + pi * radius * radius);
    }
    public static void circumference(double radius) {
        System.out.println("Circumference of circle is " + 2 * pi * radius);
    }


}
