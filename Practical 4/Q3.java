//Q3. To print area of Rectangle
import java.util.Scanner;
class AreaofRectangle {
    int length, breadth;
    AreaofRectangle(int l, int b) {  
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        AreaofRectangle rect = new AreaofRectangle(l, b);
        System.out.println("Area of rectangle = " + rect.returnArea());
    }
}
