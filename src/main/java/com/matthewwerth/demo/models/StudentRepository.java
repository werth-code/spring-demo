package com.matthewwerth.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository         //// @Repository marks this as working with data access
public interface StudentRepository
        extends JpaRepository<Student,Long> {   // We are working with JAVA PERSISTENCE API // SPECIFY what we want to work with and how to identify it.
}


//// TODO: 1/15/21 We want to use this inside of our StudentService