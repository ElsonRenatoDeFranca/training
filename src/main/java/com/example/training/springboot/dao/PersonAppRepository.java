package com.example.training.springboot.dao;


import com.example.training.springboot.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonAppRepository extends CrudRepository<Person, Long> {

    Person findByLastName(String name);

    List<Person> removeByLastName(String lastName);
}
