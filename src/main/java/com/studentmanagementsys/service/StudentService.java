package com.studentmanagementsys.service;

import com.studentmanagementsys.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    int save(StudentDto studentDto);

    int update(StudentDto studentDto); //????

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(int id);

    int deleteStudentById(int id);

    int deleteAllStudent();
}
