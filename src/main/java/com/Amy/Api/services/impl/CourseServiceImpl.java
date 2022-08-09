package com.Amy.Api.services.impl;

import com.Amy.Api.domain.CourseDTOIn;
import com.Amy.Api.domain.CourseResultDTO;
import com.Amy.Api.services.ICourseService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
     @Override
    public String getCourses(@RequestBody CourseDTOIn courseDTOIn){
        String allCourses = courseDTOIn.getChem() + courseDTOIn.getCss() + courseDTOIn.getJava()+
                            courseDTOIn.getPhp();
        return allCourses;

    }
    @Override
    public List<String> addCourses(@RequestBody CourseDTOIn courseDTOIn){
        List<String> Courses = new ArrayList<>();
        Courses.add("python");
        Courses.add("javascript");
        return Courses;

    }
    @Override
    public CourseResultDTO getResult(CourseDTOIn courseDTOIn){
        CourseResultDTO cr = new CourseResultDTO();
        /*String courses = courseDTOIn.getPhp() + courseDTOIn.getCss() + courseDTOIn.getJava()+
                       courseDTOIn.getChem();*/
        //String courses =courseDTOIn.getPhp();
        List<String > courses = List.of(("php " + "css " + "java " + "chem"));

        cr.setCourses(courses);
        List<String > founders = List.of(("rasmusLerdorf " + "hakonWilliam " + "jamesGosling " + "lavoisier"));
        cr.setFounders(founders);
        cr.setFavCourse("java");
        return cr;
    }


}
