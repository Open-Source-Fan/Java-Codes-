//Q4: Complex Numbers
//File 1: Complex.java
import java.util.Scanner;
public class Complex {
    private double real;
    private double imag;

    // Non-parameterized constructor
    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    // Parameterized constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() { return real; }
    public void setReal(double real) { this.real = real; }

    public double getImag() { return imag; }
    public void setImag(double imag) { this.imag = imag; }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    public void display() {
        System.out.printf("%7.2f + %7.2fi\n", real, imag);
    }
}

