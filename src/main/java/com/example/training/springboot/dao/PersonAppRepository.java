package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by e068635 on 9/21/2018.
 */
public interface PersonAppRepository extends JpaRepository<Person, Long> {

}
