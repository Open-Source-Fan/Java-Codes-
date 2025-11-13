//Exp9_q4
//Que: Write a program that writes an Serial No.(int), First Name (String), CGPA (float) and  Grade(char) into a text file using bufferedWriter and displays the contents using bufferedReader.

import java.io.*;
public class StudentFileIO {
    public static void main(String[] args) {
        String filename = "students.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Serial No.\tFirst Name\tCGPA\tGrade\n");
            bw.write("1\t\tShubhangi\t\t9.5\tA\n");
            bw.write("2\t\tRam\t\t9.1\tA\n");
            bw.write("3\t\tRahul\t\t7.8\tB\n");
            bw.write("4\t\tDavid\t\t9.4\tA\n");
            System.out.println("Shubhangi Tyagi 24CSU294");
            System.out.println("Data written successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nReading data from file:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
