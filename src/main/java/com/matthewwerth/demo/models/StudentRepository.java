package com.matthewwerth.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository         //// @Repository marks this as working with data access
public interface StudentRepository
        extends JpaRepository<Student,Long> {   // We are working with JAVA PERSISTENCE API // SPECIFY what we want to work with and how to identify it.

    //@Query("SELECT s FROM Student WHERE s.email = ?1") // This allows us to access our @Entity of Student. We can call on any prop of Student - id, name, email etc.
    Optional<Student> findStudentByEmail(String email);
}





//// TODO: 1/15/21 We want to use this inside of our StudentService