package com.company.email;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "mking.com";
    private int mailBoxCapacity;
    private String alternateEmail;

    // constructor for first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase()
                + "@" + department + "." + companySuffix;
    }
    // ask for the department
    public String setDepartment() {
        System.out.print("Department codes \n1.Sales \n2.Development \n3.Accounting \n0.None \nEnter the department code");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        switch (department) {
            case (1):
                return "sales";
            case (2):
                return "dev";
            case (3):
                return "acc";
        }
        return "";
    }

    // generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEF12345!@#$%";
        char[] password = new char[length];
        for(int i = 0;i<length;i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            System.out.println(rand);
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
    // generate email

    public int getMailBoxCapacity() {return mailBoxCapacity;}
    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public String getAlternateEmail() {return alternateEmail;}
    // set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getPassword() {return password;}
    // change passsword
    public void setPassword(String password) {
        this.password = password;
    }

    public String showInfo() {
        return firstName + " - " + lastName + " - " + email + " - " + mailBoxCapacity;
    }
}
