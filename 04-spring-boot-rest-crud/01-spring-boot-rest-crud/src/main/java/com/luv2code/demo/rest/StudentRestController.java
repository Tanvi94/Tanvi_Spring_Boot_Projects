package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            //check the studentId against list size
            if(studentId >= theStudentList.size() || studentId < 0) {
                throw new StudentNotFoundException("Student Id not found " + studentId);
            }
            return theStudentList.get(studentId);
    }



}
