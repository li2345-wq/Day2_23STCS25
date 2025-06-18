package org.day2.Bank;

import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class BankAccountService {
    private final MongoCollection<Document> accounts;

    public BankAccountService() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("banking");
        this.accounts = database.getCollection("accounts");
    }

    public void createAccount(BankAccount account) {
        accounts.insertOne(account.toDocument());
        System.out.println("Account created for: " + account.getOwner());
    }

    public BankAccount getAccount(String accountNumber) {
        Document doc = accounts.find(eq("accountNumber", accountNumber)).first();
        if (doc != null) {
            return BankAccount.fromDocument(doc);
        } else {
            System.out.println("Account not found.");
            return null;
        }
    }

    public void checkBalance(String accountNumber) {
        BankAccount acc = getAccount(accountNumber);
        if (acc != null) {
            System.out.println("Balance for account " + accountNumber + ": $" + acc.getBalance());
        }
    }
}
