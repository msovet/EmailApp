package com.company.bankaccountapp;

public class Savings extends Account {
    // List properties specific to Saving's account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    // Contructor
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        System.out.println("SAVING account: ");
        super.showInfo();
        System.out.println("Your saving account features" +
                "\n Safety box ID - " + safetyDepositBoxId +
                "\n Safety box Key - " + safetyDepositBoxKey +
                "\n Rate: " + rate + "%");
    }
}
