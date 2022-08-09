package com.Amy.Api.services.impl;

import com.Amy.Api.datamodel.Teacher;
import com.Amy.Api.services.ITeacherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
  public static List<Teacher> allTeachers = new ArrayList<>(List.of(new Teacher(),
            new Teacher("RB", 25, "White", "RB@gmail.com", "RB@12", 3500),
            new Teacher("Amna Malik", 22, "Brown", "AM@gmail.com", "AM@17", 2500),
            new Teacher("Minha", 32, "Black", "Minha@gmail,com", "Mi@12", 1500),
            new Teacher("Faisal", 32, "Black", "Faisal@gmail,com", "Fa@12", 1500),
            new Teacher("Iqra", 35, "Black", "Iqra@gmail,com", "Iq@12", 1700)
    ));

   @Override
    public List<Teacher> addTeachers() {
        return allTeachers;
    }
    @Override
    public Teacher getTeacher(String tchrName, int tchrAge, String tchrColor, String tchrEmail, String tchrPass, int tchrSalary) {
        Teacher t = new Teacher();
        t.setName(tchrName);
        t.setAge(tchrAge);
        t.setColor(tchrColor);
        t.setEmail(tchrEmail);
        t.setPassword(tchrPass);
        t.setSalary(tchrSalary);
        allTeachers.add(t);
        return t;
    }
    @Override
    public Teacher getTeacher(String name, int age, String color) {
        Teacher t = null;
        for (int i = 0; i < allTeachers.size(); i++) {
            if (allTeachers.get(i).getName().equals(name)) {
                t = allTeachers.get(i);
                t.setAge(age);
                t.setColor(color);

            }
        }
        return t;

    }
    @Override
    public void delTeacher(int maxAge) {
        List<Teacher> filteredTeachers = new ArrayList<>();

        for (int i = 0; i < allTeachers.size(); i++) {
            if (allTeachers.get(i).getAge() <= maxAge) {
                filteredTeachers.add(allTeachers.get(i));
            }
        }

        allTeachers = filteredTeachers;
    }
}
