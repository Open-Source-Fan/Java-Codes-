//Q2Main Class

import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();

        Vehicle v;

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }

        v.display();
        sc.close();
    }
}
