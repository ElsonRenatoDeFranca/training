package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonAppRepository extends CrudRepository<Person, Long> {

}
