/**
 * we have a superclass Bird with a method fly() representing the common
 * behavior of all birds. We then have two subclasses Duck and Sparrow, each
 * with their specific behaviors (swim() for Duck and chirp() for Sparrow).
 * 
 * The Liskov Substitution Principle (LSP) is demonstrated when we pass
 * instances of Duck and Sparrow to the makeBirdFly() method, which expects a
 * Bird. Both Duck and Sparrow are able to substitute for Bird without affecting
 * the correctness of the program. This principle ensures that subclasses can be
 * used interchangeably with their superclass.
 * 
 * @author wasif
 * @version 1.0
 * @since 04/05/2024
 */

// Superclass representing a bird
class Bird {
    // Method to fly
    void fly() {
        System.out.println("Flying...");
    }
}

// Subclass representing a duck
class Duck extends Bird {
    // Duck-specific method to swim
    void swim() {
        System.out.println("Swimming...");
    }
}

// Subclass representing a sparrow
class Sparrow extends Bird {
    // Sparrow-specific method to chirp
    void chirp() {
        System.out.println("Chirping...");
    }
}

// Main class containing the entry point of the program
public class LiskovSubstitutionPrinciple {
    // Method to make a bird fly
    static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        // Create instances of Duck and Sparrow
        Duck duck = new Duck();
        Sparrow sparrow = new Sparrow();

        // Make the Duck fly and swim
        makeBirdFly(duck);
        duck.swim();

        // Make the Sparrow fly and chirp
        makeBirdFly(sparrow);
        sparrow.chirp();
    }
}