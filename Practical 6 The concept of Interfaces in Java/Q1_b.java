//Q1_b Check if an interface can extend another interface

interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

// Main class
public class PartB {
    public static void main(String[] args) {
        // Creating an object using anonymous class
        Car myCar = new Car() {
            public void start() {
                System.out.println("Car started");
            }

            public void drive() {
                System.out.println("Car is driving");
            }
        };

        myCar.start();
        myCar.drive();
    }
}
