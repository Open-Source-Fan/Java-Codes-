//Q1. Shape Class with abstract method
abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double getArea() { return l * w; }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double getArea() { return 3.14 * r * r; }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 4);
        Shape s2 = new Circle(7);
        System.out.println("Rectangle Area: " + s1.getArea());
        System.out.println("Circle Area: " + s2.getArea());
    }
}

