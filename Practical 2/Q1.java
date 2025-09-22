//Q1. Print a Rhombus
class PrintRhombus {
    public static void main(String[] args) {
        System.out.println("Shubhangi Tyagi 24CSU294");
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
        	for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= rows; k++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
    }
}
