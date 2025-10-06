// Q3_Abstract class named Shape
abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    void CircleArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(5, 3);
        a.SquareArea(4);
        a.CircleArea(2.5);
    }
}
