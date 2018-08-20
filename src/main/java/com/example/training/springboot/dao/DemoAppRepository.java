package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Customer;
import com.example.training.springboot.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface DemoAppRepository extends CrudRepository<Person, Long> {

}
