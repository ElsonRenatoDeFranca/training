package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.DemoAppRepository;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.service.IDemoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoAppServiceImpl implements IDemoAppService {

    @Autowired
    private DemoAppRepository demoAppDAO;

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        demoAppDAO.findAll().forEach(people::add);
        return people;
    }

    @Override
    public Person findCustomerById(Long id) {
        return demoAppDAO.findById(id).get();
    }

    @Override
    public void saveCustomer(Person person) {
        this.demoAppDAO.save(person);
    }

    @Override
    public void updateCustomer(Long id, Person person) {
        demoAppDAO.save(person);
    }

    @Override
    public void deleteCustomer(Long id) {
        this.demoAppDAO.deleteById(id);
    }
}
