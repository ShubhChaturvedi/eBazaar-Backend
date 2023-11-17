package com.ebazaar.eBazaarApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer_auth")
public class CustomerAuth {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    
}
