package com.example.training.springboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by e068635 on 9/28/2018.
 */
@Data
@Entity(name = "PASSPORT")
public class Passport implements Serializable {

    @Id
    @Column(name = "DOC_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DOC_SERIAL_NUMBER", length = 30)
    private String docSerialNumber;

    @Column(name = "DOC_ISSUE_DATE")
    private Date issueDate;

    @Column(name = "DOC_EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "DOC_ISSUER_COUNTRY", length = 50)
    private String issuerCountry;

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