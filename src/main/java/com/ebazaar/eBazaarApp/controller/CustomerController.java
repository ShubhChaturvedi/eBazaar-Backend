package com.ebazaar.eBazaarApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ebazaar.eBazaarApp.entity.CustomerEntity;
import com.ebazaar.eBazaarApp.services.CustomerServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;


    @PostMapping(value="/postCustomer")
    public CustomerEntity postCustomer(@RequestBody CustomerEntity customer){
        return customerServices.postCustomer(customer);
    }

    @GetMapping(value="/getCustomerByID")
    public CustomerEntity getCustomerByID(@RequestParam int customer_id){
        return customerServices.getCustomerByID(customer_id);
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value="/getCustomer")
    public List<CustomerEntity> getCustomer(){
        return customerServices.getCustomer();
    }
    
}
