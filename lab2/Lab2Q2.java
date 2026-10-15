// Q2: Add a static counter to Circle that tracks how many circles exist,
// with a static getter.
public class Lab2Q2 {

    static class Circle {
        private static int count = 0;   // shared by ALL Circle objects
        double radius;

        Circle(double radius) {
            this.radius = radius;
            count++;                    // one more circle now exists
        }

        Circle() {
            this(1.0);                  // goes through the constructor above, so count++ happens once
        }

        // Static getter: called on the class, not on an object
        static int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println("Circles at start: " + Circle.getCount());

        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle();
        Circle c3 = new Circle(7.5);

        System.out.println("Circles after creating three: " + Circle.getCount());
    }
}
