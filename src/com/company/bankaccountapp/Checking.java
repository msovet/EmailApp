package com.company.bankaccountapp;

public class Checking extends Account{
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name,String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
//        System.out.println(accountNumber);
    }

//    @Override
//    public void checkBalance() {
//        System.out.println("Checking balance");
//    }
//
//    @Override
//    public void getSend() {
//        System.out.println("getSEND CHILD");
//    }

    public void showInfo() {
        super.showInfo();
        System.out.println("CHECKING ACCOUNT");
    }
}
