package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "ORDERS")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Order {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(name = "CUST_ID")
    private long custId;

    @Column(name = "TOTAL_PRICE", precision = 2)
    private double totPrice;

    @Column(name = "ORDER_DESC")
    private String orderDesc;

    @Column(name = "ORDER_DATE")
    private Date orderDt;

    @ManyToOne(optional=false)
    @JoinColumn(name="CUST_ID",referencedColumnName="CUST_ID")
    private Customer customer;

    @OneToOne(optional=false,cascade=CascadeType.ALL,
            mappedBy="order",targetEntity=Invoice.class)
    private Invoice invoice;

    @Column(name = "LAST_UPDATED_TIME")
    private Date updatedTime;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ORDER_ITEMS",
            joinColumns=@JoinColumn(name="ORDER_ID",referencedColumnName="ORDER_ID"),
            inverseJoinColumns=@JoinColumn(name="PROD_ID", referencedColumnName="PROD_ID")
    )
    private List<Product> productList;




}
