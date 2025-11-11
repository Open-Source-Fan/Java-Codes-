//Exp8_q4 part 2
public class TestMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("Something went wrong!");
        } catch (MyException e) {
            e.printMessage();
        }

        System.out.println("Shubhangi Tyagi and 24CSU294");
        System.out.println("Program continues after handling exception.");
    }
}

