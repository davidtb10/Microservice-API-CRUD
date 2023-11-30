package com.microservice.student.service;

import com.microservice.student.entities.Student;
import com.microservice.student.persistence.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private IStudentRepository IStudentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) IStudentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return IStudentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        IStudentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return IStudentRepository.findAllStudent(idCourse);
    }
}
