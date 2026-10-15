
import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 500.00, 100.00));
        accounts.add(new CurrentAccount("C001", 200.00, 300.00));

        accounts.get(0).deposit(100.00);

        double[] withdrawals = {550.00, 350.00};

        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);

            System.out.println("\nProcessing account "
                               + (i + 1));

            account.withdraw(withdrawals[i]);

            System.out.println("Balance before month-end: $"
                               + account.getBalance());

            account.endOfMonth();

            System.out.println("Final balance: $"
                               + account.getBalance());
        }
    }
}
