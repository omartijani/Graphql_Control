package com.example.control.service;

import com.example.control.dto.StudentDto;

import java.util.List;

public interface StudentService {
public StudentDto saveStudent(StudentDto studentDto);
public List<StudentDto> getStudentByDateNaissance(String date);
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos);
}
