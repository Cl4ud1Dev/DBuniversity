package com.example.university.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeach;

    private String courseTeached;

    String professorName;

    String professorSurname;


    //-----------------------------------------------getter e setter method ----------------------------------------


    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorSurname() {
        return professorSurname;
    }

    public void setProfessorSurname(String professorSurname) {
        this.professorSurname = professorSurname;
    }

    public Long getIdTeach() {
        return idTeach;
    }

    public void setIdTeach(Long idTeach) {
        this.idTeach = idTeach;
    }

    public String getCourseTeached() {
        return courseTeached;
    }

    public void setCourseTeached(String courseTeached) {
        this.courseTeached = courseTeached;
    }
}


