package com.matthewwerth.demo.models;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component                     //// Tells Spring that this is a bean, we need this for our @Autowired constructor in StudentController
@Service                         //// Same as @Component but more descriptive
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(1L,
                        "Matt",
                        "matthewwerth@gmail.com",
                        LocalDate.of(1987, Month.SEPTEMBER, 21),
                        33)
        );
    }

}
