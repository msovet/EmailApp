package com.company.bankaccountapp;

public class Child extends Checking{
    public Child(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
    }

    public void showInfo(){
        System.out.println("child:");
        super.showInfo();
    }
}
