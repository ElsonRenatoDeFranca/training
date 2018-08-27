package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressAppRepository extends CrudRepository<Address, Long> {

    public List<Address> findByPersonId(Long personId);

}
