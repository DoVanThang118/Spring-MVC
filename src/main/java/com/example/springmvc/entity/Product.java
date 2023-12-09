package com.example.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ProdID;

    @Column(name = "name")
    private String ProdName;

    @Column(name = "description")
    private String Description;

    @Column(name = "date")
    private Date DateOfManf;

    @Column(name = "price")
    private Double Price;

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Sale> sales = new ArrayList<>();
}
