//Q5. Distance Between Two Points
//File 1: Point.java

import java.util.Scanner;
public class Point {
    private float x;
    private float y;

    // Non-parameterized constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    // Distance function
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    // Display function with width 7 and precision 2
    public void display() {
        System.out.printf("(%7.2f , %7.2f)\n", x, y);
    }
}

