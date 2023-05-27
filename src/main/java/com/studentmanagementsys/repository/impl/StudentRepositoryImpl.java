package com.studentmanagementsys.repository.impl;

import com.studentmanagementsys.dto.StudentDto;
import com.studentmanagementsys.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate;


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
        return null;
        // return jdbcTemplate.queryForObject("SELECT * FROM student_management.students WHERE id=?", StudentDto.class, id);
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
