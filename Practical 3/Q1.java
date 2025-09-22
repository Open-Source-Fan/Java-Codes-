//Q1. Max and Min of an Array
import java.util.Scanner;
public class MaxMinofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        
        int n;  
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        sc.close();
    }
}
