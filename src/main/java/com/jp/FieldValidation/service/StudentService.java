package com.jp.FieldValidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.FieldValidation.enity.Student;
import com.jp.FieldValidation.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
