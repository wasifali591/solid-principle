/**
 * Here we have two interfaces: Workable and Breakable. The Workable interface
 * defines a method work(), and the Breakable interface defines a method
 * takeBreak(). We have two classes: Programmer and Manager.
 * 
 * The Programmer class implements only the Workable interface because
 * programmers only work and don't take breaks.
 * The Manager class implements both the Workable and Breakable interfaces
 * because managers both work and take breaks.
 * 
 * This adheres to the Interface Segregation Principle (ISP) because each
 * interface is focused on a specific responsibility, and classes only implement
 * the interfaces they need. Clients can depend on specific interfaces without
 * being forced to depend on methods they don't use.
 *
 * @author wasif
 * @version 1.0
 * @since 04/05/2024
 */

// Interface for a worker who can work
interface Workable {
    void work();
}

// Interface for a worker who can take breaks
interface Breakable {
    void takeBreak();
}

// Class representing a Programmer who implements Workable interface
class Programmer implements Workable {
    @Override
    public void work() {
        System.out.println("Programmer is working...");
    }
}

// Class representing a Manager who implements Workable and Breakable interfaces
class Manager implements Workable, Breakable {
    @Override
    public void work() {
        System.out.println("Manager is working...");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a break...");
    }
}

// Main class containing the entry point of the program
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Create instances of Programmer and Manager
        Programmer programmer = new Programmer();
        Manager manager = new Manager();

        // Use instances according to their interfaces
        programmer.work();

        manager.work();
        manager.takeBreak();
    }
}