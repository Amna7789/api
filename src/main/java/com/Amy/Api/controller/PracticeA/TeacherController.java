package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.datamodel.Teacher;
import com.Amy.Api.services.ITeacherService;
import com.Amy.Api.services.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

   @Autowired
   ITeacherService ts;

    @GetMapping("/Teachers")
    public List<Teacher> addTeachers() {
        return ts.addTeachers();

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/Teachers")
    public Teacher addTeachers(
            @RequestParam("name") String tchrName,
            @RequestParam("age") int tchrAge,
            @RequestParam("color") String tchrColor,
            @RequestParam("email") String tchrEmail,
            @RequestParam("password") String tchrPass,
            @RequestParam("salary") int tchrSalary) {
        return ts.getTeacher(tchrName, tchrAge, tchrColor, tchrEmail, tchrPass, tchrSalary);
    }



    @PutMapping("/Teachers")
    @ResponseStatus(HttpStatus.OK)
    public Teacher updateTeacher(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("color") String color
    ) {
        return ts.getTeacher(name, age, color);
    }




    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/Teachers")
    public void deleteTeacher(@RequestParam("maximumAge") int maxAge) {
        ts.delTeacher(maxAge);
    }



}
