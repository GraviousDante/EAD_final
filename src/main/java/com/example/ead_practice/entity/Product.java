package com.example.ead_practice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Product {
    @Id
    private final int proID;
    private final String prodName;
    private final String description;
    private final Date dateOfManf;
    private final double price;

    public Product(int proID, String prodName, String description, Date dateOfManf, double price) {
        this.proID = proID;
        this.prodName = prodName;
        this.description = description;
        this.dateOfManf = dateOfManf;
        this.price = price;
    }

    public int getProID() {
        return proID;
    }
    public String getProdName() {
        return prodName;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
}
