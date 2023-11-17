package com.ebazaar.eBazaarApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebazaar.eBazaarApp.entity.PaymentsEntity;

public interface PaymentsRepo extends JpaRepository<PaymentsEntity, Integer> {

    
}
