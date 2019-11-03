package edu.mum.cs.test.demo.Repository;

import edu.mum.cs.test.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository< Student, Integer> {
}
