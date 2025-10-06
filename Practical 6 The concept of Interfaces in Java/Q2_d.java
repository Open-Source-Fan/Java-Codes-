//Q2_d_ResizableCircle.java
public class ResizableCircle extends Circle implements Resizable
{
public ResizableCircle(double radius) {
        super(radius); 
    }

    // Override resize method from Resizable
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
