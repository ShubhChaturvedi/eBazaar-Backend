package com.ebazaar.eBazaarApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebazaar.eBazaarApp.repo.CustomerAuthRepo;

@Service
public class CustomerAuthService {
    
    @Autowired
    private CustomerAuthRepo customerAuthRepo;

    public boolean checkCustomerAuth(String email, String password){
        if(customerAuthRepo.findById(email).orElse(null) == null){
            return false;
        }
        else if(customerAuthRepo.findById(email).orElse(null).getPassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }


}
