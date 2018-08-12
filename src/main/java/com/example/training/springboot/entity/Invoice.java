package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "ORDER_INVOICE")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Invoice {

    @Id
    @Column(name = "INVOICE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long invoiceId;

    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "AMOUNT_DUE", precision = 2)
    private double amountDue;

    @Column(name = "DATE_RAISED")
    private Date orderRaisedDt;

    @Column(name = "DATE_SETTLED")
    private Date orderSettledDt;

    @Column(name = "DATE_CANCELLED")
    private Date orderCancelledDt;

    @Version
    @Column(name = "LAST_UPDATED_TIME")
    private Date updatedTime;
    @OneToOne(optional=false)
    @JoinColumn(name = "ORDER_ID")
    private Order order;
}
