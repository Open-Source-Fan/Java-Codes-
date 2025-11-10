//Q1 Write a program that takes 5 integer command line arguments. Create a user defined Exception named CheckArgumentException to check the number of arguments 
//passed through command line. If the number of arguments is less than five, throw the CheckArgumentException, else print the addition of all five numbers.
//Exp 8_q1_Create a user-defined exception
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class Exp8_CommandLineSum {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Please enter 5 integer arguments!");
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num;
            }
            System.out.println("Shubhangi Tyagi 24CSU294");
            System.out.println("Sum of 5 numbers = " + sum);
        }
        catch (CheckArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter valid integers only!");
        }
    }
}

