//Q5. Pattern Print of Diamond
import java.util.Scanner;

public class DiamondPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 1; i < 2 * n; i++) {
            int row = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= n - row; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * row - 1; j++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
