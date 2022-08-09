package com.Amy.Api.services;

import com.Amy.Api.datamodel.Teacher;

import java.util.List;

public interface ITeacherService {

    public List<Teacher> addTeachers();
    public Teacher getTeacher(String tchrName, int tchrAge, String tchrColor, String tchrEmail, String tchrPass, int tchrSalary);

    public Teacher getTeacher(String name, int age, String color);

    public void delTeacher(int maxAge);

}
