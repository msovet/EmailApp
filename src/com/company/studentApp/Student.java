package com.company.studentApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private int courseCost = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();


        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();


        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior" +
                "\n Enter student graduation year: ");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " course: "+ gradeYear + " Student id:" + studentId);
    }

    // Generate unique ID
    private void setStudentId() {
        ++id;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        while(1 != 0) {
            System.out.println("Enter course to enroll(q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("q")) {
                courses += "\n" + course;
                tuitionBalance += courseCost;
            } else {break;}
        }
        System.out.println("ENROLLED COURSES: " + courses);
        System.out.println("OKU TOLEMI: " + tuitionBalance);
    }
}
