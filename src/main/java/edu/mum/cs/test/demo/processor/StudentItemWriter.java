package edu.mum.cs.test.demo.processor;


import edu.mum.cs.test.demo.Repository.StudentRepository;
import edu.mum.cs.test.demo.model.Student;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentItemWriter implements ItemWriter<Student> {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void write(List<? extends Student> students) throws Exception {
        System.out.println("Data Saved for Students: " + students);
        studentRepository.saveAll(students);
    }
}
