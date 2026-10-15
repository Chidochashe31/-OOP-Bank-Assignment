// Q3: Rectangle class with area() and perimeter(). Array of 5 rectangles; print the largest by area.
public class Q3 {

    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double area() {
            return width * height;
        }

        double perimeter() {
            return 2 * (width + height);
        }

        @Override
        public String toString() {
            return "Rectangle[" + width + " x " + height + "]";
        }
    }

    public static void main(String[] args) {
        Rectangle[] rects = {
            new Rectangle(2, 3),
            new Rectangle(5, 4),
            new Rectangle(10, 1),
            new Rectangle(6, 6),
            new Rectangle(3, 7)
        };

        Rectangle largest = rects[0];
        for (Rectangle r : rects) {
            System.out.println(r + " area=" + r.area() + " perimeter=" + r.perimeter());
            if (r.area() > largest.area()) {
                largest = r;
            }
        }

        System.out.println();
        System.out.println("Largest: " + largest + " with area " + largest.area());
    }
}
