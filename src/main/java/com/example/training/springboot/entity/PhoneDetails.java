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
import javax.persistence.OneToOne;

@Entity(name = "PHONE_DETAILS")
@Data
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class PhoneDetails {

    @Id
    @Column(name = "PHONE_DETAILS_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "COLOR")
    private String color;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHONE_ID")
    private Phone phone;

}
