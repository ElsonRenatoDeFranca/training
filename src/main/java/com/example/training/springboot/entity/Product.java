package com.example.training.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "Product")
@Table(name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "PROD_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prodId;

    @Column(name = "PROD_NAME", nullable = false,length = 50)
    private String prodName;

    @Column(name = "PROD_DESC", length = 200)
    private String prodDescription;

    @Column(name = "REGULAR_PRICE", precision = 2)
    private String price;

    @Column(name = "LAST_UPDATED_TIME")
    private Date updatedTime;

    @ManyToMany(mappedBy="productList",fetch=FetchType.EAGER)
    private List<Order> orderList;

}
