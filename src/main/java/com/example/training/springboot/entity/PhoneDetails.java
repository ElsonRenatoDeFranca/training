package com.example.training.springboot.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by e068635 on 9/21/2018.
 */
@Entity(name = "PHONE_DETAILS")
@Data
@Getter
@Setter
public class PhoneDetails implements Serializable{

    @Id
    @Column(name = "PHONE_DETAILS_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "PHONE_TYPE")
    private String phoneType;

}