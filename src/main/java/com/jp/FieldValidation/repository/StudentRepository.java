package com.jp.FieldValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.FieldValidation.enity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
