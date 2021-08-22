package com.company.bankaccountapp;

import java.util.List;

public class Savings extends Account{
    // List properties specific to Saving's account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Contructor
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
//        System.out.println(accountNumber);
    }

//    @Override
//    public void checkBalance() {
//        System.out.println("Saving balance 100$");
//    }

//    public void printList(List list) {
//        System.out.println(list);
//    }

    // List methods specific to Saving's account
}
