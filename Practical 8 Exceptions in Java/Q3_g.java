//Exp8 Part7 Main Class 
public class TestHierarchy {
    public static void main(String[] args) {
        // Create a C object but upcast it to A
        A obj = new C();

        try {
            // Call the show() method
            obj.show();
        } catch (MyThirdLevelException e) {
            System.out.println("Shubhangi Tyagi 24CSU294");
            System.out.println("Caught: " + e.getMessage());
        } catch (MySecondLevelException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (MyBaseException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
