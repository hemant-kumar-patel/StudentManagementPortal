package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
}
