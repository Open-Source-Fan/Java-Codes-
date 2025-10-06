//Q5_Abstract class Bank.java
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int mark1, mark2, mark3;

    A(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    double getPercentage() {
        int total = mark1 + mark2 + mark3;
        return (total / 3.0); 
    }
}

class B extends Marks {
    int mark1, mark2, mark3, mark4;

    B(int m1, int m2, int m3, int m4) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }

    double getPercentage() {
        int total = mark1 + mark2 + mark3 + mark4;
        return (total / 4.0); 
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create objects for students
        A studentA = new A(85, 90, 95);
        B studentB = new B(80, 70, 75, 85);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
