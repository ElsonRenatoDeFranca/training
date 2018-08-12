package com.example.training.springboot.service;

import com.example.training.springboot.entity.Customer;

import java.util.List;

public interface IDemoAppService {


    /**
     *
     * @return
     */
    List<Customer> findAll();

    /**
     *
     * @param id
     * @return
     */
    Customer findCustomerById(String id);



    /**
     *
     * @param customer
     * @return
     */
    void saveCustomer(Customer customer);

    /**
     *
     * @param id
     * @return
     */
    void updateCustomer(String id, Customer customer);

    /**
     *
     * @param id
     */
    void deleteCustomer(String id);

}
