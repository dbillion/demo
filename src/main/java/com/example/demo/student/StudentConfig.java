package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return  args -> {
       Student dayo=   new Student(
                  "dayo","dayo@gmail.com", LocalDate.of(2000, 1,5));
       Student alex=   new Student(
                  "alex","alex@gmail.com", LocalDate.of(2004, 3,5));

       repository.saveAll(
               List.of(dayo,alex)
       );
      };
    };
}
