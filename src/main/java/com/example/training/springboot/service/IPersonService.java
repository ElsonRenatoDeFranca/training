package com.example.training.springboot.service;

import com.example.training.springboot.entity.Person;

import java.util.List;

public interface IPersonService {


    /**
     *
     * @return
     */
    List<Person> findAll();

    /**
     *
     * @param id
     * @return
     */
    Person findPersonById(Long id);


    /**
     *
     * @param person
     */
    void savePerson(Person person);

    /**
     *
     * @param id
     * @return
     */
    void updatePerson(Long id, Person person);

    /**
     *
     * @param id
     */
    void deletePerson(Long id);

}
