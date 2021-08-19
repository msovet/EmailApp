package com.company.bankaccountapp;

public class Checking extends Account{
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name) {
        super(name);
    }


    @Override
    public void checkBalance() {
        System.out.println("Checking balance");
    }

    @Override
    public void getSend() {
        System.out.println("getSEND CHILD");
    }
}
