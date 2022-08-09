package com.Amy.Api.datamodel;

public class Student extends Human{
    private float cgpa;

    public Student() {
        super();
        cgpa = 3.3f;

    }

    public Student(String name, int age, String color, float cgpa, String email, String password) {
        super(name, age, color, email, password);
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
