package com.example.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long SlNo;

    @Column(name = "sale_man_id")
    private Long SalesmanID;

    @Column(name = "sale_man_name")
    private String SalesmanName;

    @Column(name = "dos")
    private Date DOS;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;

}
