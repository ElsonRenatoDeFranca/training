package com.example.training.springboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by e068635 on 9/21/2018.
 */
@Entity(name = "PERSON")
@Data
@Getter
@Setter
public class Person implements Serializable {

    @Id
    @Column(name = "PERSON_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PERSON_FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "PERSON_MIDDLE_NAME", nullable = false,length = 50)
    private String middleName;

    @Column(name = "PERSON_LAST_NAME", nullable = false,length = 50)
    private String lastName;

    @Column(name = "PERSON_EMAIL", nullable = false,length = 50)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Phone> phones = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Passport passportDetails;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();

}