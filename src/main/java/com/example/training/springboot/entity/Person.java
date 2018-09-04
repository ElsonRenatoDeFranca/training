package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Entity(name = "PERSON")
public class Person {

    @Id
    @Column(name = "PERSON_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PERSON_FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "PERSON_MIDDLE_NAME", nullable = false,length = 50)
    private String middleName;

    @Column(name = "PERSON_LAST_NAME", nullable = false,length = 50)
    private String lastName;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    private DocumentIdentification documentIdentification;

    @OneToMany(mappedBy = "person", targetEntity = Address.class,fetch=FetchType.LAZY , cascade = CascadeType.ALL)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "phoneOwner", targetEntity = Phone.class,fetch=FetchType.LAZY, cascade = CascadeType.ALL )
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Phone> phones = new ArrayList<>();

    @OneToOne(mappedBy = "customerInfo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    private Customer customer;


}
