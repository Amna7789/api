package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.domain.CourseDTOIn;
import com.Amy.Api.domain.CourseResultDTO;
import com.Amy.Api.services.ICourseService;
import com.Amy.Api.services.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    ICourseService cs;

    @GetMapping("/Courses")
    public String getCourses(@RequestBody CourseDTOIn courseDTOIn){
        return cs.getCourses(courseDTOIn);
    }

    @PostMapping("/Courses")
    public List<String> addCourse(@RequestBody CourseDTOIn courseDTOIn){
        return cs.addCourses(courseDTOIn);
    }

    @GetMapping("/Result")
    public CourseResultDTO getResult(CourseDTOIn courseDTOIn) {
        return cs.getResult(courseDTOIn);
    }

}