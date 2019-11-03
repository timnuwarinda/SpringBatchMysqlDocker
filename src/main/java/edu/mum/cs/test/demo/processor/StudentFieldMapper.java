package edu.mum.cs.test.demo.processor;

import edu.mum.cs.test.demo.model.Student;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.time.LocalDate;


public class StudentFieldMapper implements FieldSetMapper {

    @Override
    public Student mapFieldSet(FieldSet fieldSet) throws BindException {
        Student student = new Student();
        student.setId(fieldSet.readInt("id"));
        student.setFirstName(fieldSet.readString("firstName"));
        student.setLastName(fieldSet.readString("lastName"));
        student.setGpa(fieldSet.readDouble("gpa"));
        student.setDOB(convertToDate(fieldSet.readInt("age")));
        return student;
    }

    public LocalDate convertToDate(Integer age){

        LocalDate currDate = LocalDate.now();
        LocalDate birthday = currDate.minusYears(age).minusMonths(0).minusDays(0);

        return birthday;
    }


}