package com.example.training.springboot.service;

import com.example.training.springboot.entity.Person;

import java.util.List;

public interface IDemoAppService {


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
    Person findCustomerById(Long id);


    /**
     *
     * @param person
     */
    void saveCustomer(Person person);

    /**
     *
     * @param id
     * @return
     */
    void updateCustomer(Long id, Person person);

    /**
     *
     * @param id
     */
    void deleteCustomer(Long id);

}
