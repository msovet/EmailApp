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
        setSafetyDepositBox();
//        System.out.println(accountNumber);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        System.out.println("Saving account: ");
        super.showInfo();
        System.out.println("Your saving account features" +
                            "\n Safety box ID - " + safetyDepositBoxId +
                            "\n Safety box Key - " + safetyDepositBoxKey +
                            "\n Rate: " + rate + "%");
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
