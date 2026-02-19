package Opgave3;

public class Main {
    void main() {
        BankAccount account = new BankAccount("Hannah", 100);

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(300);
        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(1000);
        account.withdraw(500);

        account.printTransactionHistory();

        System.out.println("\nCurrent balance: " + account.getBalance() + " kr.");
    }
}
