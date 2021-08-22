package com.company.bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate{
    // main properties for bank account
    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;
    static int index = 10000;

    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        String lastTwoSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueId = index++;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return lastTwoSSN + uniqueId + randomNumber;
    }

    protected void showInfo() {
        System.out.println(
                "Name - " + name +
                "\nSSN - " + SSN +
                "\nBalance - $" + balance +
                "\nAccountNumber - " + accountNumber
        );
    }
}
