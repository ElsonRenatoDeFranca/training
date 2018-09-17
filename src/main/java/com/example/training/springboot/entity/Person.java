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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Data
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Entity(name = "PERSON")
public class Person {

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

    /*@OneToOne(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSON_ID", referencedColumnName= "PERSON_ID")
    */

    /*@OneToOne(mappedBy = "person",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSON_ID", referencedColumnName= "PERSON_ID")*/





    @OneToOne(mappedBy = "person",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private DocumentIdentification documentIdentification;


 /* // @OneToMany(mappedBy = "person", targetEntity = Address.class,fetch=FetchType.LAZY , cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    //@NotFound(action = NotFoundAction.IGNORE)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "phoneOwner", targetEntity = Phone.class,fetch=FetchType.LAZY, cascade = CascadeType.ALL )
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Phone> phones = new ArrayList<>();

    @OneToOne(mappedBy = "customerInfo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    private Customer customer;
*/

   public void addDocumentIdentification(DocumentIdentification documentIdentification) {
        this.documentIdentification = documentIdentification;
        documentIdentification.setPerson(this);
    }

    public void removeDocumentIdentification(DocumentIdentification documentIdentification) {
        if (documentIdentification != null) {
            documentIdentification.setPerson(this);
        }
        this.documentIdentification = null;
    }

    public DocumentIdentification getDocumentIdentification() {
        return documentIdentification;
    }

    public void setDocumentIdentification(DocumentIdentification documentIdentification) {
        this.documentIdentification = documentIdentification;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

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
}
