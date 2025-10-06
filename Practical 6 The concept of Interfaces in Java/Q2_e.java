//Q2_e_Main.java
public class Main {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10);

        System.out.println("Original radius: 10");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());

        rc.resize(50);
        System.out.println("\nAfter resizing by 50%:");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}
