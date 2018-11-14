package com.example.training.springboot.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by e068635 on 9/21/2018.
 */
@Data
@Getter
@Setter
@Entity(name = "PHONE")
public class Phone implements Serializable {

    @Id
    @Column(name = "PHONE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private PhoneDetails details;

}