//Exp8_q2 2.	Create a class with a main() method that throws an object of class Exception inside a try block. 
//Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String 
//argument. Add a finally clause and print a message to prove you were there.

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throw new Exception("This is my custom exception message!");
        }

        catch (Exception e) {
            System.out.println("Shubhangi Tyagi 24CSU294");
            System.out.println("Caught Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Finally block executed successfully!");
        }
    }
}


