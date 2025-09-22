//Q2. Print the left triangle
import java.util.Scanner;
class LeftTrianglePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

