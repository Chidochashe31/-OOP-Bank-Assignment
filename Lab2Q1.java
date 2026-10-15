// Q1: Circle class with a constructor taking radius, and a no-argument
// constructor that defaults the radius to 1.0.
public class Lab2Q1 {

    static class Circle {
        double radius;

        // Constructor taking a radius
        Circle(double radius) {
            this.radius = radius;
        }

        // No-argument constructor: defaults radius to 1.0
        Circle() {
            this(1.0);   // reuse the other constructor
        }

        double area() {
            return Math.PI * radius * radius;
        }

        void display() {
            System.out.printf("Circle radius=%.2f area=%.2f%n", radius, area());
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle();     // radius defaults to 1.0

        c1.display();
        c2.display();
    }
}
