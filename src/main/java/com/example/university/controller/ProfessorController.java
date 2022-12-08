package com.example.university.controller;

import com.example.university.aggregate.Aggregate;
import com.example.university.entity.Course;
import com.example.university.entity.Professor;
import com.example.university.repository.CourseRepository;
import com.example.university.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/professor")
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    CourseRepository courseRepository;

    @PostMapping(path = "/createProf")
    public ResponseEntity<Aggregate> createProf (@RequestBody Aggregate aggregate) {

        if (aggregate == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
        }

        Professor professor = new Professor();
        professor.setProfessorName(aggregate.getNome());
        professor.setProfessorSurname(aggregate.getCognome());
        professor.setCourseTeached(aggregate.getNameCourse());
        professorRepository.save(professor);

        Course course = new Course ();
        course.setNameCourse(aggregate.getNameCourse());


        return new ResponseEntity<Aggregate> (HttpStatus.OK);
    }

    @GetMapping(path = "/getProf")
    public ResponseEntity<List<Professor>> getProf () {
        List<Professor> professors = professorRepository.findAll();
        return new ResponseEntity<List<Professor>>(professors, HttpStatus.OK);
    }

    @GetMapping(path = "/getCourse")
    public ResponseEntity<List<Course>> getCourse (){
        List<Course> courses = courseRepository.findAll();
                return new ResponseEntity<List<Course>>(courses,HttpStatus.OK);
    }

    @PostMapping(path = "/assignementNewCourse")
    public ResponseEntity<Professor> assignementNewCourse (@RequestBody Aggregate aggregate) {
        Professor professor = new Professor();
        professor.setProfessorName(aggregate.getNome());
        professor.setProfessorSurname(aggregate.getCognome());
        professor.setCourseTeached(aggregate.getNameCourse());
        List<Professor> listProf = professorRepository.findAll();
        for (Professor professors : listProf) {
            if (professorRepository.equals(listProf)) {
              return new ResponseEntity<Professor>(HttpStatus.CONFLICT);
        } else {
                professorRepository.save(professor);

                Course ncourse = new Course();
                ncourse.setNameCourse(aggregate.getNameCourse());
                courseRepository.save(ncourse);
            }
        }
                return new ResponseEntity<Professor>(HttpStatus.OK);
    }
}
