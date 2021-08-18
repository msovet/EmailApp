package com.company.bankaccountapp;

public abstract class Account implements IBaseRate{
    // main properties for bank account
    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;

    public Account(String name) {
        System.out.println("ACCOUNT SUPER " + name);
    }
}
