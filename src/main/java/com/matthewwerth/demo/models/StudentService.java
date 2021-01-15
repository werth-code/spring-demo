package com.matthewwerth.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component                     //// Tells Spring that this is a bean, we need this for our @Autowired constructor in StudentController
@Service                         //// Same as @Component but more descriptive
public class StudentService {

    private final  StudentRepository studentRepository;

    @Autowired // allows Spring to resolve and inject collaborating beans into our bean.
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll(); //JPA Method to return all as a list
    }

    public void addNewStudent(Student student) { //this connects to our registerNewStudent Method in Controller...
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("E-Mail Already Taken!"); // if the student email is already taken, throw exception
        }
        studentRepository.save(student);  // if e-mail is unique, add this to our database.
    }
}
