package com.example.training.springboot.entity;


import lombok.Data;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}