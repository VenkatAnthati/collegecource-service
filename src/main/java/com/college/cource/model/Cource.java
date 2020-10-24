package com.college.cource.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cource {

	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numberOfSubjects;
	//private List<Student> listOfStudent;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumberOfSubjects() {
		return numberOfSubjects;
	}
	public void setNumberOfSubjects(String numberOfSubjects) {
		this.numberOfSubjects = numberOfSubjects;
	}
}
