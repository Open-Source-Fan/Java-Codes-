//Q5. Reverse 3 Digit number
import java.util.Scanner;
class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int d1 = n % 10;        // last digit
        int d2 = (n / 10) % 10; // middle digit
        int d3 = n / 100;       // first digit

        int rev = d1 * 100 + d2 * 10 + d3;

        System.out.println("Reversed 3 digit number = " + rev);
    }
}
