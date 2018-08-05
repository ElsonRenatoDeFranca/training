package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface DemoAppRepository extends CrudRepository<Customer, String> {
}
