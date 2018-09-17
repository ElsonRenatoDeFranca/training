package com.example.training.springboot.entity;

import lombok.Data;

import java.io.Serializable;


public class PersonDTO implements Serializable {

    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private DocumentationIdentificationDTO documentIdentification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DocumentationIdentificationDTO getDocumentIdentification() {
        return documentIdentification;
    }

    public void setDocumentIdentification(DocumentationIdentificationDTO documentIdentification) {
        this.documentIdentification = documentIdentification;
    }
}
