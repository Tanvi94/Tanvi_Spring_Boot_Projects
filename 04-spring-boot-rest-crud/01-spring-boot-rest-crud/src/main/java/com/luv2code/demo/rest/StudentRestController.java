package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

        List<Student> theStudentList = null;

        @PostConstruct
        public void loaddata(){
            theStudentList = new ArrayList<>();
            theStudentList.add(new Student("Poornima","Patel"));
            theStudentList.add(new Student("Mario","Rossi"));
            theStudentList.add(new Student("Mary","Smith"));
        }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudentList;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
            return theStudentList.get(studentId);
    }
}
