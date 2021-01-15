package com.matthewwerth.demo.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration   // mark as a configuration Class
public class StudentConfig {

    @Bean    // Mark as a bean
    CommandLineRunner commandLineRunner(StudentRepository repository) { //Inject StudentRepository
        return args -> {

            Student matt =  new Student(1L,
                    "Matt",
                    "matthewwerth@gmail.com",
                    LocalDate.of(1987, Month.SEPTEMBER, 21));

            Student laurie =  new Student(
                    "Laurie",
                    "lauriewerth@gmail.com",
                    LocalDate.of(1987, Month.NOVEMBER, 19));

            repository.saveAll(List.of(matt, laurie));  // saveAll(TAKES A LIST) saves all to database.

        };
    }
}
