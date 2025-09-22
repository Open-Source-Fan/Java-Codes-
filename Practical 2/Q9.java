//Q9. Fibonacci Series
import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int count = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + count + " terms:");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
