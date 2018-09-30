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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
