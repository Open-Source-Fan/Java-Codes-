//Q5. Alternate sum of elements in an array
import java.util.Scanner;
class AlternateSumOfArray {
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
            if (i % 2 == 0) sum += arr[i];
        }

        System.out.println("Alternate Sum = " + sum);
    }
}



