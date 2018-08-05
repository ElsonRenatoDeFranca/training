package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.DemoAppRepository;
import com.example.training.springboot.entity.Customer;
import com.example.training.springboot.service.IDemoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoAppServiceImpl implements IDemoAppService {

    @Autowired
    //@Qualifier("DemoAppRepository")
    private DemoAppRepository demoAppDAO;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        demoAppDAO.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer findCustomerById(String id) {
        return demoAppDAO.findById(id).get();
    }

    @Override
    public void saveCustomer(Customer topic) {
        this.demoAppDAO.save(topic);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        demoAppDAO.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        this.demoAppDAO.deleteById(id);
    }
}
