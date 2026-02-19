package Opgave3;

import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("deposit", startBalance));
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactions.add(new Transaction("deposit", amount));
            System.out.println("You deposited: " + amount + " kr.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transaction("withdrawal", amount));
            System.out.println("You withdrew: " + amount + " kr.");
        } else if (amount > balance) {
            System.out.println("You don't have enough money on your account");
        }
    }

    void printTransactionHistory() {
        System.out.println("\n=== Transaction history for " + owner + " ===");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    double getBalance() {
        return balance;
    }
}
