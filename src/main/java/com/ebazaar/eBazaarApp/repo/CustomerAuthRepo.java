package com.ebazaar.eBazaarApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebazaar.eBazaarApp.entity.CustomerAuth;

public interface CustomerAuthRepo extends JpaRepository<CustomerAuth, String> {
    
}
