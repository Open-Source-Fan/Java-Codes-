//Q1_a Check if a class can extend another class and/or implement one or more interfaces
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

interface Pet {
    void play();
}

interface Friendly {
    void beFriendly();
}
class Labrador extends Dog implements Pet, Friendly {
    public void play() {
        System.out.println("Labrador loves to play");
    }

    public void beFriendly() {
        System.out.println("Labrador is very friendly");
    }
}
// Main class
public class PartA {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.eat();         
        lab.bark();        
        lab.play();        
        lab.beFriendly();  
    }
}
