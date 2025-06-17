package org.day2.Bank;
// Java program to create a MongoDb collection

import com.mongodb.client.MongoDatabase;
import com.mongodb.*;
import com.mongodb.MongoCredential;

public class Collection {

    public static void createCollection(
            String collectionName)
    {

        try {
            // establishConnections() Code
            // is defined above
            establishConnections();

            // Get the database instance
            MongoDatabase database
                    = db.getDatabase("mongoDb");

            // Create the collection
            database.createCollection(collectionName);
            System.out.println(
                    "Collection created Successfully");
        }
        catch (Exception e) {
            System.out.println(
                    "Collection creation failed");
            System.out.println(e);
        }
    }
}
