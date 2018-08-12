package com.example.training.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;


@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column(name = "CUST_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false,length = 50)
    private String lastName;

    @Column(name = "PASSPORT", nullable = false,length = 50)
    private String passport;

    @OneToMany(mappedBy="customer",targetEntity=Order.class,
            fetch=FetchType.EAGER)
    private Collection orders;

}
