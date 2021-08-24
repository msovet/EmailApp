package com.company.bankaccountapp;

import com.company.utilities.CSV;

import java.util.*;

public class BankAccountApp {
    public static void main(String[] args) {
//        Savings sAcc = new Savings("Sagat", "123456789", 5000);
//        Checking cAcc = new Checking("Bolat", "123123123", 3000);
//        Child ch = new Child("Child" , "12312311", 9000);


//        cAcc.getSend();
//        sAcc.showInfo();
//        System.out.println("**************");
//        cAcc.showInfo();
//        ch.showInfo();
//        sAcc.printBalance();
//        sAcc.deposit(800);
//        sAcc.withdraw(300);
//        sAcc.transfer("Mereyge", 2000);
//        System.out.println("*******************");
//        sAcc.compound();

        // Read CSV and create new accounts
        String file = "C:\\Users\\msovet\\Desktop\\courseDoc\\NewBankAccounts.csv";
        List<String[]> newCustomers = CSV.read(file);
        for (String [] newCustomer: newCustomers) {
            System.out.print(newCustomer[0]);
            System.out.print(newCustomer[1]);
            System.out.print(newCustomer[2]);
            System.out.println(newCustomer[3]);
        }
    }
}
