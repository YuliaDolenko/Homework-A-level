package com.company;

public class Student extends Person {

    String idNumber;
    double gpa;

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }


//    @Override
//    public String toString() {
//        return "Student{" +
//                "idNumber='" + idNumber + '\'' +
//                ", gpa=" + gpa +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", gpa='" + gpa + '\'' +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "Student{" +
//                "idNumber='" + idNumber + '\'' +
//                ", gpa=" + gpa +
//                '}';
//    }
}
