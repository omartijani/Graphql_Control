package com.example.control;

import com.example.control.dto.StudentDto;
import com.example.control.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(StudentService studentService){
        return  args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDto.builder().date("12/12/2002").email("omartjn@gmail.com").name("omar").build(),
                            StudentDto.builder().date("10/10/2002").email("omarsstjn@gmail.com").name("ar").build(),
                            StudentDto.builder().date("01/11/2002").email("omartjn@gmail.com").name("tijani").build(),
                            StudentDto.builder().date("12/01/2002").email("omartjn@gmail.com").name("om").build()
                    )

            );
        };
    }
}


