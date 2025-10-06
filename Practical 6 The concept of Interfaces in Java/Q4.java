// Q4_Create abstract class Bank
abstract class Bank {
    abstract void getBalance();
}
class BankA extends Bank {
    void getBalance() {
        System.out.println("Bank A balance: $100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("Bank B balance: $150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("Bank C balance: $200");
    }
}

// Step 3: Test the classes
class Main { // Removed 'public'
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();

        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
