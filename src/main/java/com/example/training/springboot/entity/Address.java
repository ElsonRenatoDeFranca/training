package com.example.training.springboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "ADDRESS")
@Data
public class Address {

    @Id
    @Column(name = "ADDR_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ADDR_NUMBER", length = 20)
    private String number;

    @Column(name = "ADDR_STREET", nullable = false,length = 100)
    private String street;

    @Column(name = "ADDR_ZIPCODE", nullable = false,length = 30)
    private String zipCode;

    @Column(name = "ADDR_CITY", nullable = false,length = 100)
    private String city;
}
