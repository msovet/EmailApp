package com.company.bankaccountapp;

public class Checking extends Account{
    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name,String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void showInfo() {
        System.out.println("CHECKING ACCOUNT");
        super.showInfo();
        System.out.println("Debit card features: " +
                            "\n Debit Card Number: " + debitCardNumber +
                            "\n Debit Card Pin: " + debitCardPin +
                            "\n Rate: " + rate + "%");
    }
}
