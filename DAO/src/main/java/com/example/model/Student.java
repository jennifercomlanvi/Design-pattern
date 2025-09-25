package com.example.model;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {}
    public Student(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
}
