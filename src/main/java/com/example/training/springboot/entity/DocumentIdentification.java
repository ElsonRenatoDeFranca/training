package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity(name = "DOCUMENT_IDENTIFICATION")
public class DocumentIdentification {


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

    @OneToOne
    @JoinColumn(name = "PERSON_ID")
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        this.id = person.getId();
    }

    /*public void setPerson(Person person) {
        this.person = person;
    }
    */




}
