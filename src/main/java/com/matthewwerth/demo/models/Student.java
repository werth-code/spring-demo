package com.matthewwerth.demo.models;

import com.matthewwerth.demo.person.Person;

import java.time.LocalDate;

public class Student extends Person {

    public Student(long id, String name, String email, LocalDate dob, int age) {
        super(id, name, email, dob, age);
    }
}

