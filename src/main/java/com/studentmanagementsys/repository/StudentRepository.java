package com.studentmanagementsys.repository;

import com.studentmanagementsys.dto.StudentDto;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface StudentRepository {

    int save(StudentDto studentDto);

    int update(StudentDto studentDto); //????

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(int id);

    int deleteStudentById(int id);

    int deleteAllStudent();

}
