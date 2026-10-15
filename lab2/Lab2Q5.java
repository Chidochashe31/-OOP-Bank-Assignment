// Q5: Temperature class with static factory methods fromCelsius(double) and
// fromFahrenheit(double) and a private constructor.
//
// WHY STATIC FACTORIES CAN BE CLEARER THAN OVERLOADED CONSTRUCTORS:
//  1. They have names. new Temperature(25.0) does not say whether 25 is Celsius or
//     Fahrenheit, but Temperature.fromCelsius(25.0) does.
//  2. Overloaded constructors are told apart only by parameter types. Both versions here
//     take a single double, so Java would not even allow two constructors
//     Temperature(double) - a name is the only way to tell them apart.
//  3. A factory can do extra work: validate input, reuse cached objects, or return a subtype.
//     A constructor must always create a brand-new object of exactly that class.
//  4. The private constructor means every Temperature is created through a factory,
//     so the object is always stored in one consistent unit (Celsius here).
public class Lab2Q5 {

    static class Temperature {
        private final double celsius;   // always stored internally in Celsius

        private Temperature(double celsius) {
            this.celsius = celsius;
        }

        static Temperature fromCelsius(double c) {
            return new Temperature(c);
        }

        static Temperature fromFahrenheit(double f) {
            return new Temperature((f - 32) * 5.0 / 9.0);
        }

        double toCelsius() {
            return celsius;
        }

        double toFahrenheit() {
            return celsius * 9.0 / 5.0 + 32;
        }

        @Override
        public String toString() {
            return String.format("%.1f C / %.1f F", toCelsius(), toFahrenheit());
        }
    }

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(25);
        Temperature t2 = Temperature.fromFahrenheit(212);

        System.out.println("fromCelsius(25)     -> " + t1);
        System.out.println("fromFahrenheit(212) -> " + t2);

        // Temperature t3 = new Temperature(10);   // compile error: constructor is private
    }
}
