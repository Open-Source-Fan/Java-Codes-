//Exp 7_q2
//Write a java program outside the above defined package that imports the package PackageDemo and calls its display() function.
import exercises.java.PackageDemo;   // import the class from the package (from q1)

public class OutsideDemo {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}


