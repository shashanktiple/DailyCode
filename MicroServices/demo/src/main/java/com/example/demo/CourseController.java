package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.Arrays;
import  java.util.List;

@RestController
public class CourseController{

    @RequestMapping("/Course")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "demo"),
                new Course(1, "Learn DevOps", "demo")
        );
    }
}
