package com.example.training.springboot.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

public class DocumentationIdentificationDTO implements Serializable {

    private Long id;

    private String docSerialNumber;

    private Date issueDate;

    private Date expirationDate;

    private String issuerCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocSerialNumber() {
        return docSerialNumber;
    }

    public void setDocSerialNumber(String docSerialNumber) {
        this.docSerialNumber = docSerialNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIssuerCountry() {
        return issuerCountry;
    }

    public void setIssuerCountry(String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }
}
