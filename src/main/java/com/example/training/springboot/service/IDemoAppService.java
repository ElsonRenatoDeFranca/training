package com.example.training.springboot.service;

import com.example.training.springboot.entity.Customer;

import java.util.List;

public interface IDemoAppService {


    /**
     *
     * @return
     */
    public List<Customer> findAll();

    /**
     *
     * @param id
     * @return
     */
    public Customer findCustomerById(String id);


    /**
     *
     * @param customer
     * @return
     */
    public void saveCustomer(Customer customer);

    /**
     *
     * @param id
     * @return
     */
    public void updateCustomer(String id, Customer customer);

    /**
     *
     * @param id
     */
    public void deleteCustomer(String id);

}
