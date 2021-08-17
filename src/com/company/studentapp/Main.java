package com.company.studentapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.enroll();
//        s1.showInfo();

        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        for(int i = 0;i<students.length;i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].showInfo();
        }
        // ask how many student we will add


        // Create number of new students

//        Account<Integer,String> acc = new Account<Integer,String>(11,"Alex");
//        int id = acc.getId();
//        System.out.println(id);
    }
}

//class Account<T,S> {
//    private T id;
//    private String name;
//
//    Account(T id,String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public T getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
