package com.ebazaar.eBazaarApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebazaar.eBazaarApp.entity.CustomerAuth;
import com.ebazaar.eBazaarApp.services.CustomerAuthService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerAuthConroller {

    @Autowired
    private CustomerAuthService customerAuthService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value="/checkCustomerAuth")
    public boolean checkCustomerAuth(@RequestBody CustomerAuth customerAuth){
        String email = customerAuth.getEmail();
        String password = customerAuth.getPassword();
        return customerAuthService.checkCustomerAuth(email, password);
    }
    
}
