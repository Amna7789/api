package com.Amy.Api.domain;

import java.util.List;

public class CourseResultDTO {
    List<String> courses;
    List<String> founders;
    String favCourse;

    public CourseResultDTO() {
    }

    public CourseResultDTO(List<String> courses, List<String> founders, String favCourse) {
        this.courses = courses;
        this.founders = founders;
        this.favCourse = favCourse;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> getFounders() {
        return founders;
    }

    public void setFounders(List<String> founders) {
        this.founders = founders;
    }

    public String getFavCourse() {
        return favCourse;
    }

    public void setFavCourse(String favCourse) {
        this.favCourse = favCourse;
    }
}

