package org.day2.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccountService service = new BankAccountService();
        System.out.println("%n1. Create Account%n2. Check Balance%n3. ");

        // Create a new account
        BankAccount newAccount = new BankAccount("ACC123", "Alice", 1000.0);
        service.createAccount(newAccount);

        // Check balance
        service.checkBalance("ACC123");

        //print account details
    }
}
