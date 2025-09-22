//Q2. To print the area and perimeter of a triangle 
class TriangleAreaPrint {
    int a, b, c;

    TriangleAreaPrint() {   
        a = 3;
        b = 4;
        c = 5;
    }

    void printAreaPerimeter() {
        int perimeter = a + b + c;
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        TriangleAreaPrint t = new TriangleAreaPrint();
        t.printAreaPerimeter();
    }
}
