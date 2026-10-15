// Q1: Car class with brand, year, mileage and display(). Create three cars and print them.
public class Q1 {

    static class Car {
        String brand;
        int year;
        double mileage;

        Car(String brand, int year, double mileage) {
            this.brand = brand;
            this.year = year;
            this.mileage = mileage;
        }

        void display() {
            System.out.println("Brand: " + brand + " | Year: " + year + " | Mileage: " + mileage + " km");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020, 45000.5);
        Car c2 = new Car("Ford", 1995, 210000);
        Car c3 = new Car("Honda", 2010, 120000);

        c1.display();
        c2.display();
        c3.display();
    }
}
