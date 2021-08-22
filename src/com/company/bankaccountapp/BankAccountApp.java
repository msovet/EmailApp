package com.company.bankaccountapp;

import java.util.*;

public class BankAccountApp {
    public static void main(String[] args) {
        Savings sAcc = new Savings("Sagat", "123456789", 5000);
        Checking cAcc = new Checking("Bolat", "123123123", 3000);
//        Child ch = new Child("Child" , "12312311", 9000);


//        cAcc.getSend();
//        sAcc.showInfo();
//        System.out.println("**************");
//        cAcc.showInfo();
//        ch.showInfo();
        sAcc.printBalance();
        sAcc.deposit(800);
        sAcc.withdraw(300);
        sAcc.transfer("Mereyge", 2000);
    }
}
