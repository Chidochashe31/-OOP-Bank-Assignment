// Q4: Two static blocks and two instance blocks. Predict the output, then verify.
//
// PREDICTION (main creates two objects):
//   Static block 1
//   Static block 2
//   main started
//   Instance block 1
//   Instance block 2
//   Constructor
//   Instance block 1
//   Instance block 2
//   Constructor
//
// REASON:
//  - Static blocks run ONCE, in the order written, when the class is first loaded,
//    which happens before main() runs.
//  - Instance blocks run EVERY time an object is created, in the order written,
//    before the constructor body (even though the constructor is written between them).
public class Lab2Q4 {

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Instance block 1");
    }

    Lab2Q4() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block 2");
    }

    {
        System.out.println("Instance block 2");
    }

    public static void main(String[] args) {
        System.out.println("main started");
        new Lab2Q4();
        new Lab2Q4();
    }
}
