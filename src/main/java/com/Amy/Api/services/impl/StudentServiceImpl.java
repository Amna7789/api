package com.Amy.Api.services.impl;

import com.Amy.Api.datamodel.Student;
import com.Amy.Api.services.IStudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    public static List<Student> allStudents = new ArrayList<>(List.of(
            new Student(),
            new Student("Usman", 25, "White", 3.50f, "Usman@gmail.com", "Usm@n12"),
            new Student("Ameena", 22, "Black", 3.40f, "Usm@n12", "Ameena@gmail.com")
    ));
    @Override
    public List<Student> getAllStudents(String name) {
        if(name==null || name.isBlank() || name.isEmpty())
            return allStudents;

        List filteredStds = new ArrayList<>();

        allStudents.forEach(student->{
                    //* student.getName();
                    if(student.getName().equals(name)){
                        filteredStds.add(student);
                    }
                }
        );

        return allStudents;
    }
    @Override
    public Student getStudent(String stdName, int stdAge, String stdColor, float stdCGPA, String stdEmail, String stdPswd) {
        Student s = new Student();
        s.setName(stdName);
        s.setAge(stdAge);
        s.setColor(stdColor);
        s.setCgpa(stdCGPA);
        s.setEmail(stdEmail);
        s.setPassword(stdPswd);
        allStudents.add(s);
        return s;
    }
    @Override
    public void deleteStudentByName(String n) {
        for(int i = 0; i < allStudents.size(); i++){
            if(allStudents.get(i).getName().equals(n)){
                allStudents.remove(allStudents.get(i));
            }
        }
    }
    @Override
    public Student getStudent(String n, int age) {
        Student s = null;
        for(int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).getName().equals(n)) {
                s = allStudents.get(i);
                s.setAge(age);

            }
        }
        return s;
    }
}
