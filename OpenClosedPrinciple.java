/**
 * Here we have an abstract class Shape which defines a method calculateArea()
 * to compute the area of any shape. We have concrete subclasses Rectangle and
 * Circle which extend Shape and provide implementations of the calculateArea()
 * method specific to their shapes.
 * 
 * The code follows the Open/Closed Principle (OCP) because the Shape class is
 * closed for modification; we can add new shapes (like Triangle, Square, etc.)
 * without modifying the existing Shape class. We only need to create new
 * subclasses that extend Shape and provide implementations for the
 * calculateArea() method. This way, the behavior of existing classes is not
 * altered when new shapes are introduced, ensuring that the system is open for
 * extension but closed for modification.
 * 
 * @author wasif
 * @version 1.0
 * @since 04/05/2024
 */

// Abstract class representing a generic shape
abstract class Shape {
    // Abstract method to calculate the area of a shape
    abstract double calculateArea();
}

// Concrete subclass representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the calculateArea method to calculate area of the rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method to calculate area of the circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class containing the entry point of the program
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Calculate and print area of rectangle and circle
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}