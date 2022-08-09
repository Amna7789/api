package com.Amy.Api.services;

import com.Amy.Api.datamodel.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getAllStudents(String name);

    public Student getStudent(String stdName, int stdAge, String stdColor, float stdCGPA, String stdEmail, String stdPswd);

    public void deleteStudentByName(String n);

    public Student getStudent(String n, int age);
}
