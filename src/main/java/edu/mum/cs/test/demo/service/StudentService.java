package edu.mum.cs.test.demo.service;


import edu.mum.cs.test.demo.Repository.StudentRepository;
import edu.mum.cs.test.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents(){
        return (List<Student>) repository.findAll();
    }
}
