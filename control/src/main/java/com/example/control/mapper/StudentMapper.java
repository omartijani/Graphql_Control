package com.example.control.mapper;

import com.example.control.dao.entities.Student;
import com.example.control.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDto StudentDto){
        return mapper.map(StudentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student Student){
        return mapper.map(Student, StudentDto.class);
    }
}
