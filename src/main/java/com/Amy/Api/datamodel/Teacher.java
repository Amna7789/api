package com.Amy.Api.datamodel;

public class Teacher extends Human {

    int salary;
    public Teacher(){
        super();
        salary = 3000;
    }

    public Teacher(String name, int age, String color, String email, String password, int salary) {
        super(name, age, color, email, password);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
