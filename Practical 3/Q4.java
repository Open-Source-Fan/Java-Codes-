//Q4. Sum of elements in an Array
import java.util.Scanner;
class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
