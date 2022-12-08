package com.example.university.controller;

import com.example.university.entity.Professor;
import com.example.university.entity.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProfessorControllerTest {

    @Test
    public void createProf() {
        Professor professor = new Professor();
        professor.setProfessorName( "Vito");
        professor.setProfessorSurname("Scotti");
        professor.setCourseTeached("SpringBoot");
        Assert.assertNotNull(professor);
    }

    @Test
    public void getProf() {
        Professor professor = new Professor();
        professor.setProfessorName( "Vito");
        professor.setProfessorSurname("Scotti");
        professor.setCourseTeached("SpringBoot");
        List<Professor> p = new ArrayList<>();
        p.add(professor);
        Assert.assertNotNull(p);
    }

    @Test
    public void getCourse() {
        Professor professor = new Professor();
        professor.setProfessorName( "Vito");
        professor.setProfessorSurname("Scotti");
        professor.setCourseTeached("SpringBoot");
        List<Professor> p = new ArrayList<>();
        p.add(professor);
        Assert.assertNotNull(p);
    }

    @Test
    public void assignementNewCourse() {
        Professor professor = new Professor();
        professor.setProfessorName( "Vito");
        professor.setProfessorSurname("Scotti");
        professor.setCourseTeached("SpringBoot");
        Assert.assertNotNull(professor);
    }
}