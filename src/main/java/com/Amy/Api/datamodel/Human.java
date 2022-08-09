package com.Amy.Api.datamodel;

public class Human {
    private String name;
    private int age;
    private String color;


    private String email;
    private String password;


    public Human() {
        name = "Amna";
        age = 20;
        color = "Brown";
        email="amna@gmail.com";
        password="amna007";
    }

    public Human(String name, int age, String color,String email, String password) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    /*public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gcpa=" + gcpa + '\'' +
                '}';
    }*/
}
