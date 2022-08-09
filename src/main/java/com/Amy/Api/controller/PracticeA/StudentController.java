package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.datamodel.Human;
import com.Amy.Api.datamodel.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    /*@GetMapping("/studentData")
    //creating object method
    public Student getStudent(){
    //creating object
        Student s = new Student();
        //returning values for object
        return s;
    }
    @GetMapping("/studentCustomData")
    //passing parameter in object method so that it can return values for that particular object
    public Student getStudentByName(@RequestParam("name")String name){
        Student s = new Student();
        s.setName(name);
        return s;

    }*/


        //creating list of objects and calling one object and checking if its displaying it's properties
        /*List<String> strs = new ArrayList<>();
        strs.add("abc");
         /*myStds.add(new Student());
        myStds.add(new Student("Usman", 25, "White", 3.63f));
        myStds.add(new Student("Amy", 22, "Black", 3.50f));*/

        /*Student s = new Student("Amna", 22, "Black", 3.59f);
        myStds.add(s);*/
        static List<Student> allStudents = new ArrayList<>(List.of(
                new Student(),
                new Student("Usman", 25, "White", 3.50f, "Usman@gmail.com", "Usm@n12"),
                new Student("Ameena", 22, "Black", 3.40f, "Usm@n12", "Ameena@gmail.com")
        ));

    @GetMapping("/allStudents")
    public List getAllStudents(@RequestParam("name") String name){
        return allStudents;
    }

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(
            @RequestParam("stdName") String stdName,
            @RequestParam("stdAge") int stdAge,
            @RequestParam("stdColor") String stdColor,
            @RequestParam("stdCGPA") float stdCGPA,
            @RequestParam("stdEmail") String stdEmail,
            @RequestParam("stdPswd") String stdPswd
            ) {
            /*Student s = new Student(stdName, stdAge, stdColor, stdCGPA);*/
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

    @DeleteMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public void delName(@RequestParam("name") String n) {
        for(int i = 0; i < allStudents.size(); i++){
            if(allStudents.get(i).getName().equals(n)){
                allStudents.remove(allStudents.get(i));
            }
        }
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestParam("name")String n,
                                 @RequestParam("age")int age){
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
