//Q1_c Check if an interface can extend multiple interfaces

interface Electric {
    void charge();
}

interface SelfDriving {
    void autoDrive();
}

interface FutureCar extends Electric, SelfDriving {
    void advancedMode();
}

// Main class
public class PartC {
    public static void main(String[] args) {
        // Implementing all methods using an anonymous class
        FutureCar myCar = new FutureCar() {
            public void charge() {
                System.out.println("FutureCar is charging");
            }

            public void autoDrive() {
                System.out.println("FutureCar is driving automatically");
            }

            public void advancedMode() {
                System.out.println("FutureCar in advanced mode!");
            }
        };

        myCar.charge();
        myCar.autoDrive();
        myCar.advancedMode();
    }
}
