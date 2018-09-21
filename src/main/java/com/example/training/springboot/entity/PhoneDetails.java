package com.example.training.springboot.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by e068635 on 9/21/2018.
 */
//@Entity(name = "PHONE_DETAILS")
//@Data
public class PhoneDetails implements Serializable{

/*    @Id
    @Column(name = "PHONE_DETAILS_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public void setPhone(Phone phone) {
        this.phone = phone;
        this.id = phone.getId();
    }


    @Override
    public String toString() {
        return "PhoneDetails{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", id=" + id +
                '}';
    }
    */
}
