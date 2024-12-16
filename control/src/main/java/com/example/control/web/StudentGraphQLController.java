package com.example.control.web;

import com.example.control.dto.StudentDto;
import com.example.control.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class StudentGraphQLController {
    private StudentService service;
    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student){return service.saveStudent(student);}
    @QueryMapping
    public List<StudentDto> getStudentByDate(@Argument String date){
        return service.getStudentByDateNaissance(date);
    }
}
