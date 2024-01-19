package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int length = scanner.nextInt();
        System.out.println("Enter breadth");
        int breadth = scanner.nextInt();
        System.out.println("Enter radius");
        int radius = scanner.nextInt();


        int areaOfRectangle = areaOfRectangle(length, breadth);
        int perimeter = perimeterOfRectangle(length, breadth);
        int areaOfTriangle = areaOfTriangle(length, breadth);
        int areaOfSquare = areaofSquare(length);


        System.out.println("Area of the rectangle: " + areaOfRectangle);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the triangle: " + areaOfTriangle);
        System.out.println("Area of the circle: " + areaOfCircle(radius));
        System.out.println("Area of the square: " + areaOfSquare);
    }
    public static int perimeterOfRectangle(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static int areaOfRectangle(int length, int breadth) {
        if (length == 0 || breadth == 0) {
            return 0;
        }
        return length * breadth;
    }

    public static int areaOfTriangle(int base, int height) {
        if (base == 0 || height == 0) {
            throw new RuntimeException("Base or height cannot less than 1");
        }
        return (int)(0.5 * base * height);
    }

    public static int areaOfCircle(int radius) {
        if (radius == 0) {
            return 0;
        }
        return (int)(3.14 * radius * radius);
    }

    public static int circumferenceOfCircle(int radius) {
        if (radius < 1) {
            throw new RuntimeException("Radius cannot be less then 1");
        }
        return (int)(2 * 3.14 * radius);
    }

    public static int areaofSquare(int side) {
        if (side < 1) {
            throw new RuntimeException("Side cannot be less then 1");
        }
        return side * side;
    }
}
