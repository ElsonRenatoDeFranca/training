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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Entity(name = "DOCUMENT_IDENTIFICATION")
public class DocumentIdentification {


    @Id
    @Column(name = "DOC_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DOC_SERIAL_NUMBER", length = 30)
    private String docSerialNumber;

    @Column(name = "DOC_ISSUE_DATE")
    private Date issueDate;

    @Column(name = "DOC_EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "DOC_ISSUER_COUNTRY", length = 50)
    private String issuerCountry;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    private Person person;

}
