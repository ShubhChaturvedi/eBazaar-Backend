package com.ebazaar.eBazaarApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ebazaar.eBazaarApp.entity.PaymentsEntity;
import com.ebazaar.eBazaarApp.services.PaymentServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PaymentsController {

    @Autowired
    private PaymentServices paymentsServices;

    @PostMapping(value="/postPayments")
    public PaymentsEntity postPayments(@RequestBody PaymentsEntity payments){
        return paymentsServices.postPayments(payments);
    }

    @GetMapping(value="/getPaymentsByID")
    public PaymentsEntity getPaymentsByID(@RequestParam int payment_id){
        return paymentsServices.getPaymentsByID(payment_id);
    }

    @GetMapping(value="/getPayments")
    public List<PaymentsEntity> getPayments(){
        return paymentsServices.getPayments();
    }





    
}
