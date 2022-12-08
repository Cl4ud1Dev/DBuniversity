package com.example.university.entity;

import javax.persistence.Table;

import javax.persistence.*;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String studentName ,studentSurname,courseFollowed;


    //-------------------getter setter method -------------------------------------------------------------------


    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getCourseFollowed() {
        return courseFollowed;
    }
    public void setCourseFollowed(String courseFollowed) {
        this.courseFollowed = courseFollowed;
    }

}



