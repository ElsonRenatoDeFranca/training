package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Entity(name = "ADDRESSES")
public class Address {

    @Id
    @Column(name = "ADDR_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ADDR_STREET")
    private String street;

    @Column(name = "ADDR_NUMBER")
    private String number;

    @Column(name = "ADDR_POSTAL_CODE")
    private String postalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    private Person person;


}
