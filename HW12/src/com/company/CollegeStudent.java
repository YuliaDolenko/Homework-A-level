package com.company;

import com.company.Student;

import java.util.Arrays;

public class CollegeStudent extends Student {
    String major;
    int year;
    Student[] students;
    Teacher[] teachers;
    Person[] persons;

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, String major, int year, Student[] students, Teacher[] teachers, Person[] persons) {
        super(name, age, gender, idNumber, gpa);
        this.major = major;
        this.year = year;
        this.students = students;
        this.teachers = teachers;
        this.persons = persons;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

//    @Override
//    public String toString() {
//        return "CollegeStudent{" +
//                "major='" + major + '\'' +
//                ", year=" + year +
//                '}';
//    }


    @Override
    public String toString() {
        return "CollegeStudent{" +
                "major='" + major + '\'' +
                ", year=" + year +
                ", students=" + Arrays.toString(students) +
                ", idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
