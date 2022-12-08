/*package com.example.university.HQLcontroller;

import com.example.university.aggregate.Aggregate;
import com.example.university.entity.Course;
import com.example.university.entity.Professor;
import com.example.university.entity.Student;
import com.example.university.repository.CourseRepository;
import com.example.university.repository.StudentRepository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( path = "/hql")
public class StudentControllerHQL {


    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;


    @PostMapping(path = "/createStudent")
    ArrayList<Student> createStudent (@RequestBody Student student ) {
        Query<Student> query = Session.createQuery ( "INSERT INTO student (idStudent,studentName,studentSurname,courseFollowed)\n" +
                "VALUES (001,'Cla','Nugnes','Spring'); ");
    ArrayList<Student> resultList = (ArrayList<Student>) query.getResultList();
    ArrayList<Student> students = resultList;
    return students;
    }

    @GetMapping(path = "/getstudent")
    public List<Student> getStudent () {
        Query<Student> query = Session.createQuery ( "SELECT * FROM Student ");
        return getStudent();
    }

}*/
