package com.Learn.advancejava.Learn_springBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//cources
//course:id ,name,author

@RestController
public class CourseController {

        @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1 ,"Learn Aws","Nishant"),
            new Course(2 ,"Learn Smartsheet","Ashish"),
            new Course(3 ,"Learn MERN","Nitish")

        );

    }

}
