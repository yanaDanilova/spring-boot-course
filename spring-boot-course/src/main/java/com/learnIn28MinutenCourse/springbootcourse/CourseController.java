package com.learnIn28MinutenCourse.springbootcourse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1L,"Learn AWS","in28minutes"),
                new Course(2L, "Learn DevOps","in28minutes" )
        );
    }
}
