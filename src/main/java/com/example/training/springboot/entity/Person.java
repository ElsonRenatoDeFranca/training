package com.example.training.springboot.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by e068635 on 9/21/2018.
 */
@Entity(name = "PERSON")
@Data
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

    //@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>();


    /*public void addPhone(Phone phone) {
        phones.add( phone );
        phone.setPerson( this );
    }

    public void removePhone(Phone phone) {
        phones.remove( phone );
        phone.setPerson( null );
    }
    */




    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
