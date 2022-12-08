package com.example.university.controller;

import com.example.university.entity.Student;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class StudentControllerTest {

    @org.junit.Test
    public void createStudent() {
        Student student = new Student();
        student.setStudentName( "Cla");
        student.setStudentSurname("Nug");
        student.setCourseFollowed("Spring");
        Assert.assertNotNull(student);
    }

    @org.junit.Test
    public void getStudent() {
        Student student = new Student();
        student.setStudentName( "Cla");
        student.setStudentSurname("Nug");
        student.setCourseFollowed("Spring");
        List<Student> s = new ArrayList<>();
        s.add(student);
        Assert.assertNotNull(s);

    }

    @org.junit.Test
    public void changeCourse() {
        Student student = new Student();
        student.setStudentName( "Cla");
        student.setStudentSurname("Nug");
        student.setCourseFollowed("Spring");
        Assert.assertNotNull(student);

    }

    @org.junit.Test
    public void getCourseFollowed() {
        Student student = new Student();
        student.setStudentName( "Cla");
        student.setStudentSurname("Nug");
        student.setCourseFollowed("Spring");
        List<Student> s = new ArrayList<>();
        s.add(student);
        Assert.assertNotNull(s);
    }
}