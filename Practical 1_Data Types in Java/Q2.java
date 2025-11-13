//Q2. Write a Java program to convert minutes into the number of years, months and days.
import java.util.Scanner;

class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shubhangi Tyagi 24CSU294");
        System.out.println("Enter the minutes: ");
        long minutes = sc.nextLong();

        long days = minutes / (60 * 24);   
        long years = days / 365;           
        long remainingDays = days % 365;   

        System.out.println(minutes + " minutes = " + years +
         " years and " + remainingDays + " days");

        sc.close();
    }
}


