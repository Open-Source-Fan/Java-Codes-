//Q7. Remove duplicate from Array
import java.util.Scanner;
class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j]) break;
            if (i == j) System.out.print(arr[i] + " ");
        }
    }
}


