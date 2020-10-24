package com.college.cource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.cource.model.Cource;

public interface CourseRepository extends JpaRepository<Cource, Integer>{

}
