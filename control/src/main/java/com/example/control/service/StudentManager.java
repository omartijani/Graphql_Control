package com.example.control.service;

import com.example.control.dao.entities.Student;
import com.example.control.dao.repository.StudentRepo;
import com.example.control.dto.StudentDto;
import com.example.control.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class StudentManager implements StudentService {
        private StudentRepo studentRepo;
        private StudentMapper studentMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student=studentMapper.fromStudentDtoToStudent(studentDto);
        student=studentRepo.save(student);
        studentDto=studentMapper.fromStudentToStudentDto(student);
        return studentDto;
    }

    @Override
    public List<StudentDto> getStudentByDateNaissance(String date) {
        List<Student> students=studentRepo.findStudentByDate(date);
        List<StudentDto> studentDtos= new ArrayList<>();
        for (Student s:students
             ) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(s));

        }
        return studentDtos;
    }

    @Override
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos) {
        List<Student> students = new ArrayList<>();
        for (StudentDto studentDto : studentDtos) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDto));
        }

        students = studentRepo.saveAll(students);

        studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }
}
