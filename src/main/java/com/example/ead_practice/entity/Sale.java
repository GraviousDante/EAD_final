package com.example.ead_practice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Sale {
    @Id
    int SlNo;
    int SalesmanID;
    int ProdID;
    String SalesmanName;
    Date DOS;

}
