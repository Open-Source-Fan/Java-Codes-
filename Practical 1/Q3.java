//Q3. Java program to convert temperature from Fahrenheit to Celsius
import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + c);
    }
}
