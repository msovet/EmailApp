package com.company.bankaccountapp;

import com.company.utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Read CSV and create new accounts
        String file = "path\\to\\file";
        List<String[]> newCustomers = CSV.read(file);
        for (String[] newCustomer : newCustomers) {
            String name = newCustomer[0];
            String SSN = newCustomer[1];
            String accountType = newCustomer[2];
            String balance = newCustomer[3];

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, Double.parseDouble(balance)));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, Double.parseDouble(balance)));
            } else {
                System.out.println("Error on reading account type");
            }
        }

        for (Account acc : accounts) {
            acc.showInfo();
            System.out.println();
        }
    }
}
