package com.ebazaar.eBazaarApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebazaar.eBazaarApp.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer>{
    
}
