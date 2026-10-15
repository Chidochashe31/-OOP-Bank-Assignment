// Q5: Person HAS an Address. Print a person's city with a chained dot expression,
// and show what happens when the address is null.
public class Q5 {

    static class Address {
        String street;
        String city;

        Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
    }

    static class Person {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Tendai", new Address("12 Samora Machel Ave", "Harare"));
        Person p2 = new Person("Rudo", null);   // no address

        // Chained dot expression
        System.out.println(p1.name + " lives in " + p1.address.city);

        // Address is null -> NullPointerException
        try {
            System.out.println(p2.name + " lives in " + p2.address.city);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: p2.address is null, so .city fails");
        }

        // Safe version: check for null first
        if (p2.address != null) {
            System.out.println(p2.address.city);
        } else {
            System.out.println(p2.name + " has no address on record.");
        }
    }
}
