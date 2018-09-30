package com.example.training.springboot.dao;


import com.example.training.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonAppRepository extends JpaRepository<Person, Long> {

    Person findByLastName(String name);

    List<Person> removeByLastName(String lastName);
}
