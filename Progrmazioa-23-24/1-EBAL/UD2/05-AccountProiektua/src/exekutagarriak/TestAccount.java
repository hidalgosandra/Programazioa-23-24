/*
 * A Test Driver for the Account class.
 */
package exekutagarriak;

import model.Account;

public class TestAccount {

    public static void main(String[] args) {

        System.out.println("TESTING ACCOUNT CLASS");
        System.out.println("=======================");
        // Test Constructors and toString()
        Account a1 = new Account("2095-01", "Cristina", 1000);
        System.out.println("(a) " + a1); // toString()
        Account a2 = new Account("2095-02", "Gorka");
        System.out.println("(b) " + a2); // toString()

        // Test Getters and Setters
        System.out.println("(c) " + a1.getID());
        System.out.println("(d) " + a1.getName());
        System.out.println("(e) " + a1.getBalance());

        // Test credit() and debit()
        System.out.println("(f) " + a1.credit(10));
        System.out.println("(g) " + a1.debit(5));
        System.out.println("(h) " + a1.debit(2000)); // Test debit() error

        // Test transferTo
        a1.transferTo(a2, 100);
        System.out.println("(i) " + a1);
        System.out.println("(j) " + a2);

        a2.transferTo(a1, 150);
        System.out.println("(k) " + a1);
        System.out.println("(l) " + a2);
    }
}