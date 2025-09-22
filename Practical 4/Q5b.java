//File 2: PointApp.java 
import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter coordinates of first point (x1 y1): ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.print("Enter coordinates of second point (x2 y2): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double dist = p1.distance(p2);

        System.out.print("Point 1: "); p1.display();
        System.out.print("Point 2: "); p2.display();

        System.out.printf("Distance between points: %7.2f\n", dist);

        sc.close();
    }
}



