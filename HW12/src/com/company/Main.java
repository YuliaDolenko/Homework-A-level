package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CollegeStudent ok = new CollegeStudent("sss", 12, "", "", 12.4, "", 1,
                createStudents(), createTeachers(), createPerson());


        System.out.println(Arrays.toString(ok.students));
        System.out.println(Arrays.toString(ok.teachers));
        System.out.println(Arrays.toString(ok.persons));


    }

    public static Student[] createStudents() {
        return new Student[]{
                new Student("Lynne Brooke", 16, "F", "HS95129", 3.5),
                new Student("Ima Frosh", 18, "F", "UCB123", 4.0)
        };
    }

    public static Teacher[] createTeachers() {
        return new Teacher[]{
                new Teacher("Duke Java", 34, "M", 50000.0, "Computer Science")
        };
    }

    public static Person[] createPerson() {
        return new Person[]{
                new Person("Coach Bob", 27, "M")
        };
    }



}