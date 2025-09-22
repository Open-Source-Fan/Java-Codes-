//File 2: ComplexApp.java
import java.util.Scanner;

public class ComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        // Creating objects
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Display results
        System.out.print("Sum: "); sum.display();
        System.out.print("Difference: "); diff.display();
        System.out.print("Product: "); prod.display();

        sc.close();
    }
}
