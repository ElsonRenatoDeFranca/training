package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "ORDERS")
public class Order {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "CUST_ID",insertable = false, updatable = false)
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

    @Column(name = "LAST_UPDATED_TIME")
    private Date updatedTime;

    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name="ORDER_ITEMS",
            joinColumns=@JoinColumn(name="ORDER_ID",referencedColumnName="ORDER_ID"),
            inverseJoinColumns=@JoinColumn(name="PROD_ID", referencedColumnName="PROD_ID")
    )
    private List<Product> productList;



}
