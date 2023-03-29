package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

import java.beans.BeanProperty;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return Runner->{
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudents(studentDAO);
			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {
		System.out.println("Students information is as follows:");
		List<Student> studentList = studentDAO.findAll();
		for(Student s: studentList){
			System.out.println(s);
		}

	}

	private void readStudents(StudentDAO studentDAO) {
		System.out.println("In Reading srtudent method");
		Student tempStudent1 = new Student("Satish","Madhekar","satish4664@hotmail.com");
		studentDAO.save(tempStudent1);

		System.out.println("Saving student whose id is:"+tempStudent1.getId());
		System.out.println("Retrieving student is:");

		//reading students from database by Id
		Student st1= studentDAO.findById(tempStudent1.getId());
		System.out.println(st1.toString());

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating 3 Student Object...");
		//create Student Object
		Student tempStudent1 = new Student("Mugdha","Madhekar","madhekarmugdha@gmail.com");
		Student tempStudent2 = new Student("Sneha","Kulkarni","sneha_kulkrani@hotmail.com");
		Student tempStudent3 = new Student("Anand","Dabir","anand.dabir1986@gmail.com");
		//save it
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		//display id of the Saved Student
		System.out.println("Inserted Student whose id is:"+tempStudent1.getId());
		System.out.println("Inserted Student whose id is:"+tempStudent2.getId());
		System.out.println("Inserted Student whose id is:"+tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating Student Object...");
		//create Student Object
		Student tempStudent = new Student("Tanvi","Madhekar","madhekartanvi9@gmail.com");
		//save it
		studentDAO.save(tempStudent);
		//display id of the Saved Student
		System.out.println("Inserted Student whose id is:"+tempStudent.getId());
	}
}
