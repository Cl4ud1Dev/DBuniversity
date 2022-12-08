package com.example.university.controller;

import com.example.university.aggregate.Aggregate;
import com.example.university.entity.Course;
import com.example.university.entity.Student;
import com.example.university.repository.CourseRepository;
import com.example.university.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ( path = "/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping(path = "/createStudent")
    public ResponseEntity<Aggregate> createStudent(@RequestBody Aggregate aggregate) {
        if (aggregate == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        Student student = new Student();
        student.setStudentName(aggregate.getNome());
        student.setStudentSurname(aggregate.getCognome());
        student.setCourseFollowed(aggregate.getNameCourse());
        studentRepository.save(student);

        return new ResponseEntity<Aggregate>(HttpStatus.OK);

    }

    @GetMapping(path = "/getStudent")
    public ResponseEntity<List<Student>> getStudent() {
        List<Student> students = studentRepository.findAll();
        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
    }

    @PostMapping(path = "/changeCourse")
    public ResponseEntity<Student> changeCourse(@RequestBody Aggregate aggregate) {
        Student student = new Student();
        student.setStudentName(aggregate.getNome());
        student.setStudentSurname(aggregate.getCognome());
        student.setCourseFollowed(aggregate.getNameCourse());
        List<Student> listStudent = studentRepository.findAll();
        for (Student students : listStudent) {
            if (studentRepository.equals(listStudent)) {
                return new ResponseEntity<Student>(HttpStatus.CONFLICT);

            } else {
                studentRepository.save(student);

                Course ncourse = new Course();
                ncourse.setNameCourse(aggregate.getNameCourse());
                courseRepository.save(ncourse);
            }
        }
        return new ResponseEntity<Student>(HttpStatus.OK);
    }

    @GetMapping(path = "/getCourseFollowed")
    public ResponseEntity<List<Course>> getCourseFollowed() {
        List<Course> courses = courseRepository.findAll();
        return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
    }


}
