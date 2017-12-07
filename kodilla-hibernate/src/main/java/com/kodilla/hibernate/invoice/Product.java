package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID", unique = true)
    @NotNull
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }
}
