package com.studentmanagementsys.service.impl;

import com.studentmanagementsys.dto.StudentDto;
import com.studentmanagementsys.repository.StudentRepository;
import com.studentmanagementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    final
    StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public int save(StudentDto studentDto) {
        return 0;
    }

    @Override
    public int update(StudentDto studentDto) {
        return 0;
    }

    @Override
    public List<StudentDto> getAllStudent() {
        return null;
    }

    @Override
    public StudentDto getStudentById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public int deleteStudentById(int id) {
        return 0;
    }

    @Override
    public int deleteAllStudent() {
        return 0;
    }
}
