package com.example.control.dao.repository;

import com.example.control.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> findStudentByDate(String date);
}
