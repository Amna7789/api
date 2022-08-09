package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.datamodel.Student;
import com.Amy.Api.datamodel.Teacher;
import com.Amy.Api.datamodel.User;
import com.Amy.Api.domain.LoginDTOIn;
import com.Amy.Api.services.impl.TeacherServiceImpl;
import com.Amy.Api.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/login")
    public String userLogin(
            @RequestParam("email") String email,
            @RequestParam("pswd") String password,
            @RequestParam("role") String role
    ) {

        if(role.equalsIgnoreCase("student")) {
            for (int i = 0; i < StudentController.allStudents.size(); i++) {
                Student student = StudentController.allStudents.get(i);
                if (student.getEmail().equalsIgnoreCase(email)
                        && student.getPassword().equals(password)) {
                    return "Login Successfully \n welcome " + student.getName();
                }
            }
        }
        if(role.equalsIgnoreCase("Teacher")){
            for(int i = 0; i < TeacherServiceImpl.allTeachers.size(); i++){
                Teacher t = TeacherServiceImpl.allTeachers.get(i);
                if(t.getEmail().equalsIgnoreCase(email)&&
                        t.getPassword().equals(password)){
                    return "Login Successful \n welcome " + t.getName();

                }
            }
        }

        return "Invalid email/password";
    }


    @GetMapping("/login1")
    public String userLogin1(@RequestBody LoginDTOIn LoginDTOIn) {

        /*if(loginDTOIn.getRole().equalsIgnoreCase("student")) {
            for (int i = 0; i < StudentController.allStudents.size(); i++) {
                Student std = StudentController.allStudents.get(i);
                if (std.getEmail().equalsIgnoreCase(loginDTOIn.getEmail())
                        && std.getPassword().equals(loginDTOIn.getPassword())) {
                    return "Login Successfully \n welcome " + std.getName();
                }
            }
        }*/
        if(LoginDTOIn.getRole().equalsIgnoreCase("Teacher")){
            for(int i = 0; i < TeacherServiceImpl.allTeachers.size(); i++){
                Teacher t = TeacherServiceImpl.allTeachers.get(i);
                if(t.getEmail().equalsIgnoreCase(LoginDTOIn.getEmail())&&
                        t.getPassword().equals(LoginDTOIn.getPassword())){
                    return "Login Successful \n welcome " + t.getName();

                }
            }
        }

        return "Invalid email/password";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping("/user")
    public void addUser(){
        userService.addUser();
    }
}
