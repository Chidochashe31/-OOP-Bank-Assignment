// Q3: Employee class with an auto-incrementing employeeId (static counter),
// three overloaded constructors and a copy constructor.
public class Lab2Q3 {

    static class Employee {
        private static int nextId = 1001;   // shared counter; every new Employee takes the next value

        private final int employeeId;
        private String name;
        private String department;
        private double salary;

        // Constructor 1: name only
        Employee(String name) {
            this(name, "Unassigned", 0.0);
        }

        // Constructor 2: name + department
        Employee(String name, String department) {
            this(name, department, 0.0);
        }

        // Constructor 3: name + department + salary (the "main" one)
        Employee(String name, String department, double salary) {
            this.employeeId = nextId++;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // Copy constructor: copies the data, but the copy gets its OWN new id
        Employee(Employee other) {
            this(other.name, other.department, other.salary);
        }

        void display() {
            System.out.println("ID: " + employeeId + " | " + name + " | " + department + " | salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai");
        Employee e2 = new Employee("Rudo", "IT");
        Employee e3 = new Employee("Farai", "Finance", 1500.0);
        Employee e4 = new Employee(e3);   // copy of e3

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
