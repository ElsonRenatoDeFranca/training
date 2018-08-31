package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneDetailsRepository  extends CrudRepository<Address, Long> {

    List<Phone> findByPersonId(Long personId);

}
