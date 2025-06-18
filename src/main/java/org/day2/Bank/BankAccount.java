package org.day2.Bank;
import org.bson.Document;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public Document toDocument() {
        return new Document("accountNumber", accountNumber)
                .append("owner", owner)
                .append("balance", balance);
    }

    public static BankAccount fromDocument(Document doc) {
        return new BankAccount(
                doc.getString("accountNumber"),
                doc.getString("owner"),
                doc.getDouble("balance")
        );
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }
}
