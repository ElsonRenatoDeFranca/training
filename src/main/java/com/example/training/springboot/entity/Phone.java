package com.example.training.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by e068635 on 9/21/2018.
 */
@Data
@Entity(name = "PHONE")
public class Phone implements Serializable {

    @Id
    @Column(name = "PHONE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "PERSON_ID")
    //@ManyToOne
    //private Person person;

    /*@OneToOne(mappedBy = "phone", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private PhoneDetails phoneDetails;

    public void addDetails(PhoneDetails details) {
        details.setPhone( this );
       // this.phoneDetails = details;
    }


    public void removeDetails() {
        if ( phoneDetails != null ) {
            phoneDetails.setPhone( null );
            this.phoneDetails = null;
        }
    }
    */


    @Override
    public String toString() {
        return "Phone{" +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                '}';
    }
}
