package com.ebazaar.eBazaarApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebazaar.eBazaarApp.entity.PaymentsEntity;
import com.ebazaar.eBazaarApp.repo.PaymentsRepo;

@Service
public class PaymentServices {

    @Autowired
    private PaymentsRepo paymentsRepo;


    public PaymentsEntity postPayments(PaymentsEntity payments){
        return paymentsRepo.save(payments);
    }

    public PaymentsEntity getPaymentsByID(int payment_id){
        return paymentsRepo.findById(payment_id).orElse(null);
    }

    public List<PaymentsEntity> getPayments(){
        return paymentsRepo.findAll();
    }


    
}
