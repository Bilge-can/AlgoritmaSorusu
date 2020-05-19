package com.company;

import java.util.Random;

public class Student {

    private String studentNumber;//private olarak öğrenci numarası tanımladık
    public String studentName,studentSurname,studentProgram,studentFaculty;//öğrenciye ait diğer özellikleri tanımladık

    public Student(String studentName,String studentSurname,String studentProgram, String studentFaculty){
        //constructor yani yapılandırıcı bir metot hazırlardık. Bu nesne sınıfı kullanılırken new parameteresi ile, bu temel özellikler istenecek
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentProgram = studentProgram;
        this.studentFaculty = studentFaculty;
        this.studentNumber = generateStudentNumber();
    }

    protected String generateStudentNumber(){
        // her eklenen öğrenci için yeni bir random okul numarası oluşturuan fonksiyon
        Random r = new Random();
        String alphabet = "0123456789";
        String number = "";
        for (int i = 0; i < 10; i++) {
            number += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return number;//random oluşan öğrenci numarasını göndürdük
    }

    public void getStudentNameSurnameNumber(){
        System.out.println(StudentHelpers.student.getStudentName() + " " + StudentHelpers.student.getStudentSurname() + " " + StudentHelpers.student.getStudentNumber());
    }

    public Student(){
        //constructor yani yapılandırıcı bir metot hazırlardık. Bu nesne sınıfı kullanılırken new parameteresi ile, bu temel özellikler göndrilmez ise bu fonk çalışırı
    }

    public String getStudentNumber() {
        // get fonksiyonu ile her değişken için geri dönüş fonksiyonu yazdık
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        // set fonksiyonu ile her değişken için veri ayarlama fonksiyonu yazdık
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(String studentProgram) {
        this.studentProgram = studentProgram;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }
}
