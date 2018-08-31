package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneDetailsRepository  extends JpaRepository<Address, Long> {

    List<Phone> findByPersonId(Long personId);

}
