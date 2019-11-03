package edu.mum.cs.test.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
	private Integer id;
	private String firstName;
    private String lastName;
    private Double gpa;
    private LocalDate DOB;



	public Student() {
	}

	public Student(Integer id, String firstName, String lastName, Double gpa, LocalDate DOB) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.DOB = DOB;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", DOB=" + DOB.toString() + "]";
	}
}
