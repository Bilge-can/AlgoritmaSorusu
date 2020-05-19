package com.company;

public class StudentHelpers extends Student{

    public static Student student;

    StudentHelpers(String studentName,String studentSurname,String studentProgram,String studentFaculty){
        Student newStudent = new Student();
        newStudent.setStudentName(studentName);// this ön eki ile birlikte bu sınıfa daha önce yapılandırıcı üzerinden eklenen değeri aldık
        newStudent.setStudentSurname(studentSurname);
        newStudent.setStudentProgram(studentProgram);
        newStudent.setStudentFaculty(studentFaculty);
        newStudent.setStudentNumber(newStudent.generateStudentNumber());// getStudentNumber fonksiyonun oluşturduğu ve geri dönderdiği öğrenci numarasını nesne içerisindeki number değerine atadık
        Main.students.add(newStudent);// yeni öğrenci nesnesini main içerisinde bulunan öğrenci modeli tipindeki arralist e ekledik
        student = newStudent;
    }

    @Override
    public void getStudentNameSurnameNumber(){
        System.out.println("öğrenci eklendi");
        System.out.println("kalıtılan fonk : " + StudentHelpers.student.getStudentName() + " " + StudentHelpers.student.getStudentSurname() + " " + StudentHelpers.student.getStudentNumber());

    }

}
