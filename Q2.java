import java.time.Year;

// Q2: Add isAntique() to Car; returns true when the car is more than 25 years old.
public class Q2 {

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

        boolean isAntique() {
            int currentYear = Year.now().getValue();
            return (currentYear - year) > 25;
        }
    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", 2020, 45000.5),
            new Car("Ford", 1995, 210000),
            new Car("Honda", 2010, 120000)
        };

        for (Car c : cars) {
            c.display();
            System.out.println("  Antique? " + c.isAntique());
        }
    }
}
