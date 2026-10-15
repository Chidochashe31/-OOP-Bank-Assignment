// Q4: Rectangle r2 = r1; change r2.width; print r1.width.
//
// Prediction: r1.width prints 10.0 (not 5.0).
// Explanation: "Rectangle r2 = r1;" copies the REFERENCE, not the object. r1 and r2 both
// point to the same Rectangle on the heap, so changing the width through r2 is visible
// through r1. To get an independent copy, use: new Rectangle(r1.width, r1.height).
public class Q4 {

    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = r1;      // copies the reference

        r2.width = 10;          // change through r2

        System.out.println("r1.width = " + r1.width);
        System.out.println("r2.width = " + r2.width);
        System.out.println("Same object? " + (r1 == r2));

        // For comparison: a true independent copy
        Rectangle r3 = new Rectangle(r1.width, r1.height);
        r3.width = 99;
        System.out.println("After changing the real copy r3: r1.width = " + r1.width);
    }
}
