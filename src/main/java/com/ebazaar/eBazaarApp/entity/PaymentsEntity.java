package com.ebazaar.eBazaarApp.entity;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payments")
public class PaymentsEntity {

    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private int paymentId;


    // foreign key to customer table
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "payment_amount")
    private int paymentAmount;
    
}
