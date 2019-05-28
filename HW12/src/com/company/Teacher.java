package com.company;

import com.company.Person;

public class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", subject=" + subject +
                ", salary='" + salary + '\'' +
                '}';
    }
}
