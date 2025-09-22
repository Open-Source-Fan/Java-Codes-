//Q4. Java program to find the sum of digits of a 3-digit number entered by the user
import java.util.Scanner;

class SumOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int d1 = num % 10;       // last digit
        int d2 = (num / 10) % 10; // middle digit
        int d3 = num / 100;       // first digit

        int sum = d1 + d2 + d3;

        System.out.println("Sum of three digits = " + sum);
    }
}
