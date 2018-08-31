package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressAppRepository extends JpaRepository<Address, Long> {

    @Query(value = "select * from ADDRESS a where a.PERSON_ID = :personId", nativeQuery = true)
    List<Address> findAddressByPersonId(@Param("personId") Long personId);

}
