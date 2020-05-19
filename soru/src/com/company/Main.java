package com.company;

import java.util.ArrayList;

public class Main{

    public static ArrayList<Student> students = new ArrayList<>();
    public static Student student,student1,student2;

    public static void main(String[] args) {
        StudentHelpers student = new StudentHelpers("bilge","can","software","techonologies");
        student.getStudentNameSurnameNumber();
        StudentHelpers student1 = new StudentHelpers("elif","xyzxyz","software","techonologies");
        student1.getStudentNameSurnameNumber();
        StudentHelpers student2 = new StudentHelpers("mehmet","blabla","software","techonologies");
        student2.getStudentNameSurnameNumber();
    }
}
