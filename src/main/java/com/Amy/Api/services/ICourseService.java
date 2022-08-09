package com.Amy.Api.services;

import com.Amy.Api.domain.CourseDTOIn;
import com.Amy.Api.domain.CourseResultDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ICourseService {

    public String getCourses(@RequestBody CourseDTOIn courseDTOIn);

    public List<String> addCourses(@RequestBody CourseDTOIn courseDTOIn);

    public CourseResultDTO getResult(CourseDTOIn courseDTOIn);



}
